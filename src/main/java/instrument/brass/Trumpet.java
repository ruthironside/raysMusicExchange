package instrument.brass;

import instrument.InstrumentType;

public class Trumpet extends Brass {
    public Trumpet(String material, String colour, InstrumentType instrumentType, int numberOfValves) {
        super(material, colour, instrumentType, numberOfValves);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
