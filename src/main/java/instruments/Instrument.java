package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.Family;

public abstract class Instrument implements IPlay, ISell{

    private String description;
    private double sellingPrice;
    private double buyingPrice;
    private Family family;
    private String sound;

    public Instrument(String description, double sellingPrice, double buyingPrice, Family family, String sound){
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.family = family;
        this.sound = sound;
    }

    public String play(){
        return this.sound;
    }

    public String getDescription() {
        return this.description;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public Family getFamily() {
        return this.family;
    }

    public double getMarkup() {
        return (this.sellingPrice - this.buyingPrice);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

}
