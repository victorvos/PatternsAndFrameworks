package Opdracht2Week1;

/**
 * Created by Victor on 15-11-2016.
 */
public class Knight extends Character {
    public Knight() {
        setStrength(2);
    }
    public void fight() {
        weapon.useWeapon(strength);
// other fighting behaviors
    }
}
