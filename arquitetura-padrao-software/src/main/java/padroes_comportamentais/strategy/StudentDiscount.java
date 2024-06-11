package padroes_comportamentais.strategy;

class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * 0.80;
    }
}