package instruments;

import enums.Family;

public class Piano extends Instrument{
    private boolean grandPiano;

    public Piano(String description, double sellingPrice, double buyingPrice, boolean grandPiano, String sound) {
        super(description, sellingPrice, buyingPrice, Family.STRING, sound);
        this.grandPiano = grandPiano;
    }

    public boolean isGrandPiano() {
        return grandPiano;
    }
}
