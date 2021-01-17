package instrument.woodwind;

import instrument.Instrument;
import instrument.InstrumentType;

public abstract class Woodwind extends Instrument {

    private int numberOfFingerHoles;

    public Woodwind(String material, String colour, InstrumentType instrumentType, int numberOfFingerHoles) {
        super(material, colour, instrumentType);
        this.numberOfFingerHoles = numberOfFingerHoles;
    }

    public int getnumberOfFingerHoles() {
        return numberOfFingerHoles;
    }
}
