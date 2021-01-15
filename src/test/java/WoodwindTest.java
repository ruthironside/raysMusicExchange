import instrument.woodwind.Clarinet;
import instrument.woodwind.Woodwind;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {
    Woodwind woodwind;

    @Before
    public void setUp() {
        woodwind = new Clarinet("plastic", "black", "Yamaha", "??" );

    }

    @Test
    public void canPlay() {
        assertEquals("playing: Toot", woodwind.playInstrument("Toot"));
    }
}
