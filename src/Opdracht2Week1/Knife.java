package Opdracht2Week1;

/**
 * Created by Victor on 15-11-2016.
 */
public class Knife implements Weapon {
    @Override
    public void useWeapon(int strength) {
        System.out.println("Stab a knife and kill "+strength);
    }
}
