package Opdracht2Week1;

/**
 * Created by Victor on 15-11-2016.
 */
public class Soldier extends Character {
    public Soldier() {
        setStrength(1);
    }
    public void fight() {
        weapon.useWeapon(strength);
// other fighting behaviors
    }
}