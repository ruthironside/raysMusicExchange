package instrument.woodwind;

public class Saxaphone extends Woodwind {
    public Saxaphone(String material, String colour, String type, int numberOfFingerHoles) {
        super(material, colour, type, numberOfFingerHoles);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
