package instrument.brass;

public class Trumpet extends Brass {
    public Trumpet(String material, String colour, String type, int numberOfValves) {
        super(material, colour, type, numberOfValves);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
