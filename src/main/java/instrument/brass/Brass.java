package instrument.brass;

import instrument.Instrument;

public abstract class Brass extends Instrument {

    private int numberOfValves;

    public Brass(String material, String colour, String type, int numberOfValves) {
        super(material, colour, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
