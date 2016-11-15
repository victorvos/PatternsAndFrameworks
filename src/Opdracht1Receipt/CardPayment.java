package Opdracht1Receipt;

/**
 * Created by Victor on 15-11-2016.
 */
public class CardPayment implements Payment{
    public String acceptPayment(double amount) {
        return ("Payment costs 0.15 \nBedrag :" + amount+0.15);
    }
}
