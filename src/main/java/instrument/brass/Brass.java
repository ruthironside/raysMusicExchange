package instrument.brass;

import instrument.Instrument;
import instrument.InstrumentType;

public abstract class Brass extends Instrument {

    private int numberOfValves;


    public Brass(String material, String colour, InstrumentType instrumentType, int numberOfValves) {
        super(material, colour, instrumentType);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
