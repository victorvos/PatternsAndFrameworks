package Opdracht1ReceiptWeek1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Victor on 15-11-2016.
 */
public class Receipt extends Item {
    public int ID;
    public Date datum;
    public Payment payment;
    public List<Item> items;
    public double totaal;

    public Receipt(int ID, Date datum, double totaal){
        this.ID = ID;
        this.datum = datum;
        this.totaal = totaal;
        items = new ArrayList<Item>;
    }

    public void addPayment(Payment p){
        payment = p;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public double getTotaal{}{
        this.totaal = 0;
        for (Item i : items) {
            totaal += i.getPrijs();
        }
    }

    public String Chechout


}
