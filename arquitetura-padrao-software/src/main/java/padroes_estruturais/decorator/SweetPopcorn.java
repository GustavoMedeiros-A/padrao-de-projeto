package padroes_estruturais.decorator;

public class SweetPopcorn extends PopcornDecorator {

    public SweetPopcorn(Popcorn popcorn) {
        super(popcorn);
    }

    public float getPopcornPricePercentage() {
        return 10.0f;
    }

    public String getStructureName() {
        return "SweetPopcorn";
    }

}
