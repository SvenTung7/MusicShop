import behaviours.ISell;
import instruments.Piano;
import items.Drumsticks;
import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    HashMap<ISell, Integer> stock;
    Drumsticks drumsticks;
    GuitarStrings guitarStrings;
    Piano piano;

    @Before
    public void before() {
        drumsticks = new Drumsticks("A pair of brand new drum sticks", 10, 7.99);
        guitarStrings = new GuitarStrings("A set of 6 guitar strings", 12.99, 7.99);
        piano = new Piano("Brand new grand piano", 120000, 113000, true, "Plunk");
        stock = new HashMap<>();
        stock.put(drumsticks, 20);
        stock.put(guitarStrings, 15);
        shop = new Shop(stock);
    }

    @Test
    public void canGetAllItemsHashMap() {
        assertEquals(2, shop.getAllItems().size());
    }

    @Test
    public void canAddNewItem() {
        shop.addNewItem(piano, 1);
        assertEquals(3, shop.getAllItems().size());
    }

    @Test
    public void canRemoveItem() {
        shop.removeItem(drumsticks);
        assertEquals(1, shop.getAllItems().size());
    }

    @Test
    public void canGetStockCount() {
        assertEquals(15, shop.getStockCount(guitarStrings));
    }

    @Test
    public void canIncreaseStock() {
        shop.increaseStock(guitarStrings, 5);
        assertEquals(20, shop.getStockCount(guitarStrings));
    }

    @Test
    public void canDecreaseStock() {
        shop.decreaseStock(drumsticks, 2);
        assertEquals(18, shop.getStockCount(drumsticks));
    }

    @Test
    public void canCalculateTotalMarkup() {
        assertEquals(115.2, shop.calculateTotalMarkup(), 0.01);
    }
}
