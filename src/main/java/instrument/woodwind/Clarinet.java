package instrument.woodwind;

import instrument.InstrumentType;

public class Clarinet extends Woodwind {
    public Clarinet(String material, String colour, InstrumentType instrumentType, int numberOfFingerHoles) {
        super(material, colour, instrumentType, numberOfFingerHoles);

    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
