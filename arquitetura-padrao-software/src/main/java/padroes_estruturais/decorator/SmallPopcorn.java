package padroes_estruturais.decorator;

public class SmallPopcorn implements Popcorn {

    public float popcornPrice;

    public SmallPopcorn() {
    }

    public SmallPopcorn(float popcornPrice) {
        this.popcornPrice = popcornPrice;
    }

    public float getPopcornPrice() {
        return popcornPrice;
    }

    public String getStructure() {
        return "SmallPopcorn";
    }
}
