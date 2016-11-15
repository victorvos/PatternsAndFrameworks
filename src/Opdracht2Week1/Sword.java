package Opdracht2Week1;

/**
 * Created by Victor on 15-11-2016.
 */
public class Sword implements Weapon {
    @Override
    public void useWeapon(int strength) {
        System.out.println("Swing a sword and kill "+strength);
    }
}
