package instrument.woodwind;

public class Flute extends Woodwind {
    public Flute(String material, String colour, String type, int numberOfFingerHoles) {
        super(material, colour, type, numberOfFingerHoles);
    }


    public String playInstrument(String play) {
        return playTune(play);
    }
}



