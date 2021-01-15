package instrument.brass;

public class Trumpet extends Brass {
    public Trumpet(String material, String colour, String type) {
        super(material, colour, type);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
