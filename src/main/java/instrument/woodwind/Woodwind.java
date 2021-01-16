package instrument.woodwind;

import behaviours.ISell;
import instrument.Instrument;

public abstract class Woodwind extends Instrument {

    private int numberOfFingerHoles;


    public Woodwind(String material, String colour, String type, int numberOfFingerHoles) {
        super(material, colour, type);
        this.numberOfFingerHoles = numberOfFingerHoles;
    }

    public int getnumberOfFingerHoles() {
        return numberOfFingerHoles;
    }


}
