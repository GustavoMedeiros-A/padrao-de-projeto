package padroes_estruturais.decorator;

public abstract class PopcornDecorator implements Popcorn {

    private Popcorn popcorn;
    public String structure;

    public PopcornDecorator(Popcorn popcorn) {
        this.popcorn = popcorn;
    }

    public abstract float getPopcornPricePercentage();

    public float getPopcornPrice() {
        return this.popcorn.getPopcornPrice() * (1 + getPopcornPricePercentage() / 100); // Calc popcorn final price
    }

    public abstract String getStructureName();

    public String getStructure() {
        return this.popcorn.getStructure() + "/" + this.getStructureName();
    }

}
