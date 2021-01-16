package instrument.brass;

public class Tuba extends Brass {
    public Tuba(String material, String colour, String type, int numberOfValves) {
        super(material, colour, type, numberOfValves);
    }

    public String playInstrument(String play) {
        return playTune(play);
    }
}
