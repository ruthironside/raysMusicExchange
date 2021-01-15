package instrument.woodwind;

public class Flute extends Woodwind {
    public Flute(String material, String colour, String type, String name) {
        super(material, colour, type, name);
    }


    public String playInstrument(String play) {
        return playTune(play);
    }
}



