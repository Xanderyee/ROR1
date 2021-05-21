import java.awt.*;


// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
// public class Player
//
// Survivor character
//
public class Player extends Animate {

    public void draw(Graphics g) {
        Color testColor = Color.BLACK;

        g.setColor(testColor);
        g.fillOval(x, y, w, h);
    }

}
// end: public class Player