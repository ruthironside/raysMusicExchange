package instrument.brass;

public class FrenchHorn extends Brass{
    public FrenchHorn(String material, String colour, String type, int numberOfValves) {
        super(material, colour, type,numberOfValves);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
