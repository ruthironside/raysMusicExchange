import item.ViolinStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinStringsTest {

    ViolinStrings violinStrings;

    @Before
    public void setUp() {
        violinStrings = new ViolinStrings("Yamaha", 10, 20);
    }

    @Test
    public void violinStringsMake() {
        assertEquals("Yamaha", violinStrings.getMake());
    }

    @Test
    public void violinStringsHasBuyingPrice() {
        assertEquals(10, violinStrings.getBuyingPrice(), 0.01);
    }

    @Test
    public void violinStringsHasSellingPrice() {
        assertEquals(20, violinStrings.getSellingPrice(), 0.01);
    }
}
