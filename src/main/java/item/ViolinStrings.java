package item;

import behaviours.ISell;

public class ViolinStrings implements ISell {

    private String make;

    private double buyingPrice;
    private double sellingPrice;

    public ViolinStrings(String make, double buyingPrice, double sellingPrice) {
        this.make = make;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
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
