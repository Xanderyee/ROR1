//imports

public class Entity extends Animate {

    int hp, dmg;
    

    void setHP(int hp) { this.hp = hp; }
    void setDMG(int dmg) { this.dmg = dmg; }

    int getHP() { return this.hp; };
    int getDMG() { return this.dmg; }

    //void changeHP(int change) { this.hp += change; }
    //maybe have this for a more continuous change
}
