package instruments;

import enums.Family;

public class FrenchHorn extends Instrument{

    private int numberOfValves;
    public FrenchHorn(String description, double sellingPrice, double buyingPrice, int numberOfValves, String sound) {
        super(description, sellingPrice, buyingPrice, Family.BRASS, sound);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
