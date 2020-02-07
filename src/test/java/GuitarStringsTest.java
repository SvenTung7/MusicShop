import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("A set of 6 guitar strings", 12.99, 7.99);
    }

    @Test
    public void canGetDescription() {
        assertEquals("A set of 6 guitar strings", guitarStrings.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(12.99, guitarStrings.getSellingPrice(), 0);
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(7.99, guitarStrings.getBuyingPrice(), 0);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(5, guitarStrings.getMarkup(), 0);
    }

    @Test
    public void canSetDescription() {
        guitarStrings.setDescription("2 sets of guitar strings");
        String expected = "2 sets of guitar strings";
        assertEquals(expected, guitarStrings.getDescription());
    }

    @Test
    public void canSetSellingPrice() {
        guitarStrings.setSellingPrice(21.99);
        assertEquals(21.99, guitarStrings.getSellingPrice(), 0);
    }

    @Test
    public void canSetBuyingPrice() {
        guitarStrings.setBuyingPrice(14.99);
        assertEquals(14.99, guitarStrings.getBuyingPrice(), 0);
    }
}
