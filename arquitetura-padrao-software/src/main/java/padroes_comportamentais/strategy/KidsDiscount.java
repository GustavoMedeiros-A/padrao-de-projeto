package padroes_comportamentais.strategy;

public class KidsDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * 0.90;
    }

}
