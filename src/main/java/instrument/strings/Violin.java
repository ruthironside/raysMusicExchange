package instrument.strings;

public class Violin extends Strings {
    public Violin(String material, String colour, String type) {
        super(material, colour, type);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
