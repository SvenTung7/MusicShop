import enums.Family;
import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drumkit;
    @Before
    public void before(){
        drumkit = new Drums("A full drumkit, slightly worn from use", 500, 340, 4, "Tap tap tap");
    }

    @Test
    public void canPlay(){
        assertEquals("Tap tap tap", drumkit.play());
    }

    @Test
    public void canGetDescription() {
        String expected = "A full drumkit, slightly worn from use";
        assertEquals(expected, drumkit.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(500, drumkit.getSellingPrice(), 0);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(340, drumkit.getBuyingPrice(), 0);
    }

    @Test
    public void canGetFamily() {
        assertEquals(Family.PERCUSSION, drumkit.getFamily());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(160, drumkit.getMarkup(), 0);
    }

    @Test
    public void canSetDescription() {
        drumkit.setDescription("A brand new kit");
        String expected = "A brand new kit";
        assertEquals(expected, drumkit.getDescription());
    }

    @Test
    public void canSetSellingPrice() {
        drumkit.setSellingPrice(750);
        assertEquals(750, drumkit.getSellingPrice(), 0);
    }

    @Test
    public void canSetBuyingPrice() {
        drumkit.setBuyingPrice(550);
        assertEquals(550, drumkit.getBuyingPrice(), 0);
    }

    @Test
    public void canGetNumberOfDrums() {
        assertEquals(4, drumkit.getNumberOfDrums());
    }

    @Test
    public void canSetNumberOfDrums() {
        drumkit.setNumberOfDrums(3);
        assertEquals(3, drumkit.getNumberOfDrums());
    }
}
