import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

/**
 * Created by Link on 2/27/2016.
 */
public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);

        velX = r.nextInt(5) + 1;
        velY = r.nextInt(5);

    }

    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }
}
