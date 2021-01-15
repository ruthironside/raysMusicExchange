package instrument.brass;

import instrument.Instrument;

public abstract class Brass extends Instrument {

    private String name;

    public Brass(String material, String colour, String type) {
        super(material, colour, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
