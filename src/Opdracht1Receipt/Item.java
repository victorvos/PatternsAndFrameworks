package Opdracht1Receipt;

import java.util.ArrayList;

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

    public double getPrijs(){
        return prijs;
    }


}
