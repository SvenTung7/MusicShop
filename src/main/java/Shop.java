import behaviours.ISell;

import java.util.HashMap;

public class Shop {
    private HashMap<ISell, Integer> stock;

    public Shop(HashMap<ISell, Integer> stock) {
        this.stock = stock;
    }

    public HashMap<ISell, Integer> getAllItems() {
        return this.stock;
    }

    public void addNewItem(ISell item, int amount) {
        this.stock.put(item, amount);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public int getStockCount(ISell item) {
        return this.stock.get(item);
    }

    public void increaseStock(ISell item, int amount) {
        int newStockCount = (getStockCount(item) + amount);
        this.stock.put(item, newStockCount);
    }

    public void decreaseStock(ISell item, int amount) {
        if (getStockCount(item) > amount) {
            int newStockCount = (getStockCount(item) - amount);
            this.stock.put(item, newStockCount);
        }
    }

    public double calculateTotalMarkup() {
        double total = 0;
        for (ISell item : this.stock.keySet()) {
           total += (item.getMarkup() * getStockCount(item));
        }
        return total;
    }
}
