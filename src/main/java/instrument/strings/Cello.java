package instrument.strings;

public class Cello extends Strings{
    public Cello(String material, String colour, String type, int numberOfStrings) {
        super(material, colour, type, numberOfStrings);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
