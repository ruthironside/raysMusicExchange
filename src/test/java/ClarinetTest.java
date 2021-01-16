import instrument.woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void setUp() {
        clarinet = new Clarinet("Plastic", "Black", "Woodwind", 17 );
    }

    @Test
    public void clarinetHasMaterial() {
        assertEquals("Plastic", clarinet.getMaterial());
    }

    @Test
    public void clarinetHasColour() {
        assertEquals("Black", clarinet.getColour());
    }

    @Test
    public void clarinetHasType() {
        assertEquals("Woodwind", clarinet.getType());
    }

    @Test
    public void returnNumberOfFingerHoles() {
        assertEquals(17, clarinet.getnumberOfFingerHoles());
    }

    @Test
    public void canPlay() {
        assertEquals("playing: Toot", clarinet.playInstrument("Toot"));
    }
}

