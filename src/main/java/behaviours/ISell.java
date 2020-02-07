package behaviours;

public interface ISell {

    String getDescription();
    double getSellingPrice();
    double getBuyingPrice();
    void setDescription(String description);
    void setSellingPrice(double sellingPrice);
    void setBuyingPrice(double buyingPrice);
    double getMarkup();
}
