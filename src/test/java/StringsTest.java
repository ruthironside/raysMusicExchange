import instrument.strings.Strings;
import instrument.strings.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {
    Strings strings;

    @Before
    public void setUp() {
        strings = new Violin("wood", "brown", "???");

    }

    @Test
    public void canPlay() {
        assertEquals("playing: beep", strings.playInstrument("beep"));
    }
}
