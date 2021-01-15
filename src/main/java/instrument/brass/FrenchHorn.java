package instrument.brass;

public class FrenchHorn extends Brass{
    public FrenchHorn(String material, String colour, String type) {
        super(material, colour, type);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
