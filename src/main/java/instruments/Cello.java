package instruments;

import enums.Family;

public class Cello extends Instrument{

    private int numberOfStrings;
    public Cello(String description, double sellingPrice, double buyingPrice, int numberOfStrings, String sound) {
        super(description, sellingPrice, buyingPrice, Family.STRING, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
