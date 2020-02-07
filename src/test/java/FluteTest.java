import enums.Family;
import instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;
    @Before
    public void before(){
        flute = new Flute("Second hand flute, very worn from use", 125, 100, 3, "Wheee");
    }

    @Test
    public void canPlay(){
        assertEquals("Wheee", flute.play());
    }

    @Test
    public void canGetDescription() {
        String expected = "Second hand flute, very worn from use";
        assertEquals(expected, flute.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(125, flute.getSellingPrice(), 0);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(100, flute.getBuyingPrice(), 0);
    }

    @Test
    public void canGetFamily() {
        assertEquals(Family.WOODWIND, flute.getFamily());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(25, flute.getMarkup(), 0);
    }

    @Test
    public void canSetDescription() {
        flute.setDescription("Second hand flute, recently restored");
        String expected = "Second hand flute, recently restored";
        assertEquals(expected, flute.getDescription());
    }

    @Test
    public void canSetSellingPrice() {
        flute.setSellingPrice(300);
        assertEquals(300, flute.getSellingPrice(), 0);
    }

    @Test
    public void canSetBuyingPrice() {
        flute.setBuyingPrice(170);
        assertEquals(170, flute.getBuyingPrice(), 0);
    }

    @Test
    public void canGetOctaveRange() {
        assertEquals(3, flute.getRange());
    }
}
