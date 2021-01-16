package instrument.woodwind;

public class Clarinet extends Woodwind {
    public Clarinet(String material, String colour, String type, int numberOfFingerHoles) {
        super(material, colour, type, numberOfFingerHoles);

    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
