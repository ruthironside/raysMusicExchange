import instrument.brass.Brass;
import instrument.brass.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {
    Brass brass;

    @Before
    public void setUp() {
        brass = new Tuba("brass", "gold", "???");

    }

    @Test
    public void canPlay() {
        assertEquals("playing: Toot", brass.playInstrument("Toot"));
    }
}