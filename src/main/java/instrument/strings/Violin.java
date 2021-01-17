package instrument.strings;

import behaviours.ISell;
import instrument.InstrumentType;

public class Violin extends Strings implements ISell {


    public Violin(String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(material, colour, instrumentType, numberOfStrings);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }

}
