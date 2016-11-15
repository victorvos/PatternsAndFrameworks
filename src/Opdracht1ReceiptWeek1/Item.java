package Opdracht1ReceiptWeek1;

/**
 * Created by Victor on 15-11-2016.
 */
public class Item {
    public String naam;
    public double prijs;

    public Item(String nm, double prijs){
        this.naam = nm;
        this.prijs = prijs;
    }

    public Item(){

    }

    public double getPrijs(){
        return prijs;
    }


}
