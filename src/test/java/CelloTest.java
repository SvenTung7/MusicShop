import enums.Family;
import instruments.Cello;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before(){
        cello = new Cello("Old and brown but in good condition", 2399, 2199, 4, "Vruuuum");
    }

    @Test
    public void canPlay(){
        assertEquals("Vruuuum", cello.play());
    }

    @Test
    public void canGetDescription() {
        String expected = "Old and brown but in good condition";
        assertEquals(expected, cello.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(2399, cello.getSellingPrice(), 0);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2199, cello.getBuyingPrice(), 0);
    }

    @Test
    public void canGetFamily() {
        assertEquals(Family.STRING, cello.getFamily());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(200, cello.getMarkup(), 0);
    }

    @Test
    public void canSetDescription() {
        cello.setDescription("Second hand, barely used kept in great condition");
        String expected = "Second hand, barely used kept in great condition";
        assertEquals(expected, cello.getDescription());
    }

    @Test
    public void canSetSellingPrice() {
        cello.setSellingPrice(3000);
        assertEquals(3000, cello.getSellingPrice(), 0);
    }

    @Test
    public void canSetBuyingPrice() {
        cello.setBuyingPrice(2450);
        assertEquals(2450, cello.getBuyingPrice(), 0);
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(4, cello.getNumberOfStrings());
    }

    @Test
    public void canSetNumberOfStrings() {
        cello.setNumberOfStrings(5);
        assertEquals(5, cello.getNumberOfStrings());
    }
}
