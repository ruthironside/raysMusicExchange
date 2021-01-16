package item;

import behaviours.ISell;

public class SheetMusic implements ISell {

    private String songName;

    private double buyingPrice;
    private double sellingPrice;

    public SheetMusic(String songName, double buyingPrice, double sellingPrice) {
        this.songName = songName;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getSongName() {
        return songName;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }


    public double calculateMarkup() {
        return getSellingPrice() - this.getBuyingPrice();
    }
}
