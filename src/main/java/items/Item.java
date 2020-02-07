package items;

import behaviours.ISell;

public abstract class Item implements ISell{
    private String description;
    private double sellingPrice;
    private double buyingPrice;

    public Item(String description, double sellingPrice, double buyingPrice) {
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
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

    public double getMarkup() {
        return (this.sellingPrice - this.buyingPrice);
    }
}
