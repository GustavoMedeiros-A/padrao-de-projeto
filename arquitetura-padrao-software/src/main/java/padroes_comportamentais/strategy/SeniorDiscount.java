package padroes_comportamentais.strategy;

public class SeniorDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * 0.70;
    }
}
