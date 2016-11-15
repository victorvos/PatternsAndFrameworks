package Opdracht1Receipt;

/**
 * Created by Victor on 15-11-2016.
 */
public class CashPayment implements Payment {
    public String acceptPayment(double amount) {
        return ("Payment costs 0.0 \nBedrag :" + amount);
    }
}

