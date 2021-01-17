import instrument.InstrumentType;
import instrument.strings.Violin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() {
        violin = new Violin("Wood", "Brown", InstrumentType.STRINGS, 4);
    }

    @Test
    public void violinHasMaterial() {
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void violinHasColour() {
        assertEquals("Brown", violin.getColour());
    }

    @Test
    public void violinHasType() {
        assertEquals(InstrumentType.STRINGS, violin.getInstrumentType());
    }

    @Test
    public void returnNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("playing: faaaa", violin.playInstrument("faaaa"));
    }

    @Test
    public void canSetSellingPrice() {
        violin.setSellingPrice(300);
        assertEquals(300, violin.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetBuyingPrice() {
        violin.setBuyingPrice(50);
        assertEquals(50, violin.getBuyingPrice(), 0.01);
    }

    @Test
    public void testCalculateMarkup() {
        violin.setBuyingPrice(50);
        violin.setSellingPrice(300);
        assertEquals(250, violin.calculateMarkup(), 0.01);
    }
}


