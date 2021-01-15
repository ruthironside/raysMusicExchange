package instrument.woodwind;

public class Clarinet extends Woodwind {
    public Clarinet(String material, String colour, String type, String name) {
        super(material, colour, type, name);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
