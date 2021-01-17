import instrument.InstrumentType;
import instrument.brass.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void setUp() {
        tuba = new Tuba("Metal", "Gold", InstrumentType.BRASS, 17 );
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
        assertEquals(InstrumentType.BRASS, tuba.getInstrumentType());
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
