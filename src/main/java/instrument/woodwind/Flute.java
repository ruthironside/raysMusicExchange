package instrument.woodwind;

import instrument.InstrumentType;

public class Flute extends Woodwind {
    public Flute(String material, String colour, InstrumentType instrumentType, int numberOfFingerHoles) {
        super(material, colour, instrumentType, numberOfFingerHoles);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}



