package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<ISell>();
    }

    public void addProductToShop(ISell product){
        this.stock.add(product);
    }

    public void removeProductFromShop(ISell product) {
        this.stock.remove(product);
    }

    public int getStockCount() {
        return this.stock.size();
    }
}
