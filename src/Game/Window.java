package Game;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class Window extends Canvas {
    private static final long serialVersionUID = -1231231231412049L;

    public Window(int width, int height, String title, Game game) {
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // can we resize our window?
        frame.setLocationRelativeTo(null); // window starts in the middle of the screen (if this isn't included it just starts in the top left corner)
        frame.add(game); //
        frame.setVisible(true);
        game.start(); // runs the start method in game
    }
}

