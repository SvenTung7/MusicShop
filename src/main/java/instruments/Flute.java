package instruments;

import enums.Family;

public class Flute extends Instrument{

    private int range;
    public Flute(String description, double sellingPrice, double buyingPrice, int range, String sound) {
        super(description, sellingPrice, buyingPrice, Family.WOODWIND, sound);
        this.range = range;
    }

    public int getRange() {
        return range;
    }
}
