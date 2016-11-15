package Opdracht2Week1;

/**
 * Created by Victor on 15-11-2016.
 */
public class King extends Character {
    public King() {
        setStrength(4);
    }
    public void fight() {
        weapon.useWeapon(strength);
// other fighting behaviors
    }
}
