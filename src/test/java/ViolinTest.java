
import instrument.strings.Violin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() {
        violin = new Violin("Wood", "Brown", "String", 4);

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
        assertEquals("String", violin.getType());
    }

    @Test
    public void returnNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("playing: faaaa", violin.playInstrument("faaaa"));
    }
}


