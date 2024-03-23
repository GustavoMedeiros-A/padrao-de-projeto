package padroes_estruturais.composite;

public class Streaming {

    private Category catalog;

    public void setCatalog(Category catalog) {
        this.catalog = catalog;
    }

    public String getCatalog() {
        if (this.catalog == null) {
            throw new NullPointerException("Streaming without catalog");
        }
        return this.catalog.getCategory();
    }

}
