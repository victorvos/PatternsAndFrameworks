package Opdracht1ReceiptWeek1;

/**
 * Created by Victor on 15-11-2016.
 */
public class Main {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.addItem(new Item("Double room", 69.0));
        receipt.addItem(new Item("Diner", 29.0));
        receipt.addItem(new Item("Tourist tax", 1.99));
        receipt.addPayment(new CashPayment());
        receipt.checkOut();
    }
}
