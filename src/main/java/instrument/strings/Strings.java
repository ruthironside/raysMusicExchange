package instrument.strings;

import instrument.Instrument;


public abstract class Strings extends Instrument {


    private String name;

    public Strings(String material, String colour, String type) {
        super(material, colour, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
