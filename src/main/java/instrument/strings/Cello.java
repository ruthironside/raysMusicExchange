package instrument.strings;

public class Cello extends Strings{
    public Cello(String material, String colour, String type) {
        super(material, colour, type);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
