package instruments;

import enums.Family;

public class Drums extends Instrument {
    private int numberOfDrums;
    public Drums(String description, double sellingPrice, double buyingPrice, int numberOfDrums, String sound) {
        super(description, sellingPrice, buyingPrice, Family.PERCUSSION, sound);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public void setNumberOfDrums(int numberOfDrums) {
        this.numberOfDrums = numberOfDrums;
    }
}
