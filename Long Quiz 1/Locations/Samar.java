package Locations;

import Tourists.Tourist;

public class Samar implements Locations {

    public int airFare = 100;

    
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}