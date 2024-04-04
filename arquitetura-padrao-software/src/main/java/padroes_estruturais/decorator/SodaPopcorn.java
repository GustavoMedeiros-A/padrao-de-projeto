package padroes_estruturais.decorator;

public class SodaPopcorn extends PopcornDecorator {

    public SodaPopcorn(Popcorn popcorn) {
        super(popcorn);
    }

    public float getPopcornPricePercentage() {
        return 20.0f;
    }

    public String getStructureName() {
        return "SodaPopcorn";
    }

}
