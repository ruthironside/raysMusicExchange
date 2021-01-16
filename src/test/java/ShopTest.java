import behaviours.ISell;
import instrument.woodwind.Clarinet;
import item.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop stock;
    Clarinet clarinet;
    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        stock = new Shop();
        clarinet = new Clarinet("Plastic", "Black", "Woodwind", 17);
        sheetMusic = new SheetMusic("Twinkle Twinkle Little Star", 3, 5);
    }

    @Test
    public void addAProductToShop() {
        stock.addProductToShop(clarinet);
        assertEquals(1, stock.getStockCount());
    }

    @Test
    public void removeAProductToShop() {
        stock.addProductToShop(clarinet);
        stock.addProductToShop(sheetMusic);
        stock.addProductToShop(sheetMusic);
        stock.removeProductFromShop(clarinet);
        assertEquals(2, stock.getStockCount());
    }
}
