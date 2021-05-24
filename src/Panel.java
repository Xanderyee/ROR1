import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;


// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
// public class Panel extends JPanel
//
// Creates a panel with all the scene objects
//
public class Panel extends JPanel {

    private static int scale = 50; //change later, this controls window size
    private static int w = 16;
    private static int h = 9; //common 16:9 ratio

    public static int getW() {return w*scale;}
    public static int getH() {return h*scale;}

    public Dimension getPreferredSize() {return new Dimension(getW(),getH());}

    //todo: add private variable inits for scenery etc
    private Player player;

    public Panel() {
	    //todo: add objects from files
        player = new Player();
        player.x = 200;
        player.y = 200;
        player.w = 10;
        player.h = 10;
    }

    public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	    //todo: add initial position for everything, at their x,y position
        player.draw(g);
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(10);
                //do we want to change this? (changes framerate I think)
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            //todo: add movement here, as well as menu changes
            //perhaps have functions for each menu, and call them here

            repaint();
        }
    }
}
// end: public class Panel