import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferStrategy;
import java.util.Random;
/**
 * Created by Link on 2/27/2016.
 */
public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9; // 16:9 aspect ratio.
    private Thread thread;
    private boolean running = false;
    private Handler handler;

    private Random r;

    public Game() {
        new Window(WIDTH, HEIGHT, "Waves", this);

        handler = new Handler();
        handler.addObject(new Player(100, 100, ID.Player));
        r = new Random();
        for(int i = 0; i < 50; i++) {
            handler.addObject(new Player(0, 0, ID.Player));
        }
    }

    public synchronized void start() {
        //single threaded game.
        thread = new Thread(this);
        thread.start();
        running = true; //
    }

    public synchronized void stop() {
        try{
            thread.join();
            running = false;
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void run() {
        // game loop goes here
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1) {
                tick();
                delta--;
            }
            if(running)
                render();
            frames++;
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick() {
        handler.tick();
    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null) {
          this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        handler.render(g);

        g.dispose();
        bs.show();
    }

    public static void main(String[] args){
        new Game();
    }

}
