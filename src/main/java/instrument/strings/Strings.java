package instrument.strings;

import instrument.Instrument;
import instrument.InstrumentType;

public abstract class Strings extends Instrument {

    private int numberOfStrings;

    public Strings(String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(material, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
