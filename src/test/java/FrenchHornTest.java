import enums.Family;
import instruments.FrenchHorn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrenchHornTest {
    FrenchHorn frenchHorn;
    @Before
    public void before(){
        frenchHorn = new FrenchHorn("Brand new french horn", 2000, 1700, 3, "Parp");
    }

    @Test
    public void canPlay(){
        assertEquals("Parp", frenchHorn.play());
    }

    @Test
    public void canGetDescription() {
        String expected = "Brand new french horn";
        assertEquals(expected, frenchHorn.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(2000, frenchHorn.getSellingPrice(), 0);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(1700, frenchHorn.getBuyingPrice(), 0);
    }

    @Test
    public void canGetFamily() {
        assertEquals(Family.BRASS, frenchHorn.getFamily());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(300, frenchHorn.getMarkup(), 0);
    }

    @Test
    public void canSetDescription() {
        frenchHorn.setDescription("Second hand french horn");
        String expected = "Second hand french horn";
        assertEquals(expected, frenchHorn.getDescription());
    }

    @Test
    public void canSetSellingPrice() {
        frenchHorn.setSellingPrice(1600);
        assertEquals(1600, frenchHorn.getSellingPrice(), 0);
    }

    @Test
    public void canSetBuyingPrice() {
        frenchHorn.setBuyingPrice(1400);
        assertEquals(1400, frenchHorn.getBuyingPrice(), 0);
    }

    @Test
    public void canGetOctaveRange() {
        assertEquals(3, frenchHorn.getNumberOfValves());
    }
}
