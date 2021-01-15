package instrument.brass;

public class Tuba extends Brass {
    public Tuba(String material, String colour, String type) {
        super(material, colour, type);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
