package instrument.strings;

import instrument.Instrument;


public abstract class Strings extends Instrument {


    private int numberOfStrings;

    public Strings(String material, String colour, String type, int numberOfStrings) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
