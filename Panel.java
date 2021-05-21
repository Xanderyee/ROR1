import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class Panel extends JPanel {

    private static int scale = 200; //change later, this controls window size
    private static int w = 16;
    private static int h = 9; //common 16:9 ratio

    public static int getW() {return w*scale;}
    public static int getH() {return h*scale;}

    public Dimension getPreferredSize() {return new Dimension(getW(),getH());}

    //todo: add private variable inits for scenery etc
    
    public Panel() {
	//todo: add objects from files
    }

    public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	//todo: add initial position for everything, at their x,y position
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
