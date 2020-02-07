import items.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("A pair of brand new drum sticks", 10, 7.99);
    }

    @Test
    public void canGetDescription() {
        assertEquals("A pair of brand new drum sticks", drumsticks.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(10, drumsticks.getSellingPrice(), 0);
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(7.99, drumsticks.getBuyingPrice(), 0);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(2.01, drumsticks.getMarkup(), 0);
    }

    @Test
    public void canSetDescription() {
        drumsticks.setDescription("A pair of mallet variant drum sticks, in good condition.");
        String expected = "A pair of mallet variant drum sticks, in good condition.";
        assertEquals(expected, drumsticks.getDescription());
    }

    @Test
    public void canSetSellingPrice() {
        drumsticks.setSellingPrice(15);
        assertEquals(15, drumsticks.getSellingPrice(), 0);
    }

    @Test
    public void canSetBuyingPrice() {
        drumsticks.setBuyingPrice(12.99);
        assertEquals(12.99, drumsticks.getBuyingPrice(), 0);
    }


}
