package instrument.strings;


public class Violin extends Strings {


    public Violin(String material, String colour, String type, int numberOfStrings) {
        super(material, colour, type, numberOfStrings);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }

}
