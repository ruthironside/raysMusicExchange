package instrument.woodwind;

public class Saxaphone extends Woodwind {
    public Saxaphone(String material, String colour, String type, String name) {
        super(material, colour, type, name);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
