import java.awt.*;


// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
// public class Player
//
// Survivor character
//
public class Player extends Entity {

    public Player(int x, int y, int w, int h, int hp, int vx, int vy, int dmg) {
	this.x = x;
	this.y = y;
	this.w = w;
	this.h = h;
	this.hp = hp;
	this.vx = vx;
	this.vy = vy;
	this.dmg = dmg;

	//we will initialize this in a parent class
	//this.xp = 0.0;
    }
    
    public void draw(Graphics g) {
        Color testColor = Color.BLACK;

        g.setColor(testColor);
        g.fillOval(x, y, w, h);
    }

}
// end: public class Player
