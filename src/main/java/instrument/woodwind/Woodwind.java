package instrument.woodwind;

import instrument.Instrument;

public abstract class Woodwind extends Instrument {

    private String name;


    public Woodwind(String material, String colour, String type, String name) {
        super(material, colour, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
