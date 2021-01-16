package instrument.strings;


import behaviours.ISell;

public class Violin extends Strings implements ISell {


    public Violin(String material, String colour, String type, int numberOfStrings) {
        super(material, colour, type, numberOfStrings);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }

    public double calculateMarkup() {
        return 0;
    }
}
