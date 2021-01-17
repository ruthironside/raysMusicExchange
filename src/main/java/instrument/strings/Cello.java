package instrument.strings;

import instrument.InstrumentType;

public class Cello extends Strings{
    public Cello(String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(material, colour, instrumentType, numberOfStrings);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
