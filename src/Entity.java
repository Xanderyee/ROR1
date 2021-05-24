//imports

public class Entity extends Animate {

    int hp, spd;
    

    void setHP(int hp) { this.hp = hp; }
    void setSPD(int spd) { this.spd = spd; }

    int getHP() { return this.hp; };
    int getSPD() { return this.spd; }

    //void changeHP(int change) { this.hp += change; }
    //void changeSpd(int change) { this.spd += change; }
    //maybe have this for a more continuous change
}
