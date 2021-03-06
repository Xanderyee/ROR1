// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
// public class Animate
//
// Controls animation of objects
//
public class Animate {

    int x, y, w, h;
    double vx, vy;

    // Setter methods for position and size
    void setX(int x) { this.x = x; }
    void setY(int y) { this.y = y; }
    void setW(int w) { this.w = w; }
    void setH(int h) { this.h = h; }
    void setVX(int vx) { this.vx = vx; }
    void setVY(int vy) { this.vy = vy; }

    // Getter methods for position and size
    int getX() { return this.x; }
    int getY() { return this.y; }
    int getW() { return this.w; }
    int getH() { return this.h; }
    double getVX() { return this.vx; }
    double getVY() { return this.vy; }

}
// end: public class Animate
