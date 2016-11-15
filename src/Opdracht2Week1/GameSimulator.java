package Opdracht2Week1;

/**
 * Created by Victor on 15-11-2016.
 */
public class GameSimulator {
    public static void main(String[] args) {
        Character arthur = new King();
        Weapon excalibur = new Sword();
        Weapon dagger = new Knife();
        arthur.setWeapon(excalibur);
        arthur.fight();
        arthur.setWeapon(dagger);
        arthur.fight();
    }
}