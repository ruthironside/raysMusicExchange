import item.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("Yesterday - The Beatles", 5, 10);
    }

    @Test
    public void sheetMusicHasName() {
        assertEquals("Yesterday - The Beatles", sheetMusic.getSongName());
    }

    @Test
    public void sheetMusicHasBuyingPrice() {
        assertEquals(5, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void sheetMusicHasSellingPrice() {
        assertEquals(10, sheetMusic.getSellingPrice(), 0.01);
    }
}
