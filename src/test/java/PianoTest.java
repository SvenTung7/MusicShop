import enums.Family;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;
    @Before
    public void before(){
        piano = new Piano("Brand new grand piano", 120000, 113000, true, "Plunk");
    }

    @Test
    public void canPlay(){
        assertEquals("Plunk", piano.play());
    }

    @Test
    public void canGetDescription() {
        String expected = "Brand new grand piano";
        assertEquals(expected, piano.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(120000, piano.getSellingPrice(), 0);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(113000, piano.getBuyingPrice(), 0);
    }

    @Test
    public void canGetFamily() {
        assertEquals(Family.STRING, piano.getFamily());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(7000, piano.getMarkup(), 0);
    }

    @Test
    public void canSetDescription() {
        piano.setDescription("Second hand grand piano");
        String expected = "Second hand grand piano";
        assertEquals(expected, piano.getDescription());
    }

    @Test
    public void canSetSellingPrice() {
        piano.setSellingPrice(97000);
        assertEquals(97000, piano.getSellingPrice(), 0);
    }

    @Test
    public void canSetBuyingPrice() {
        piano.setBuyingPrice(94000);
        assertEquals(94000, piano.getBuyingPrice(), 0);
    }

    @Test
    public void canGetOctaveRange() {
        assertEquals(true, piano.isGrandPiano());
    }
}
