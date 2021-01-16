import instrument.brass.Tuba;
import instrument.woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void setUp() {
        tuba = new Tuba("Metal", "Gold", "Brass", 17 );
    }

    @Test
    public void tubaHasMaterial() {
        assertEquals("Metal", tuba.getMaterial());
    }

    @Test
    public void tubaHasColour() {
        assertEquals("Gold", tuba.getColour());
    }

    @Test
    public void tubaHasType() {
        assertEquals("Brass", tuba.getType());
    }


    @Test
    public void returnNumberOfValves() {
        assertEquals(17, tuba.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("playing: Toot", tuba.playInstrument("Toot"));
    }
}
