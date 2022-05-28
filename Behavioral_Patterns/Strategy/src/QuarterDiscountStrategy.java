public class QuarterDiscountStrategy implements PromoteStrategy {

    @Override
    public Double DoDiscount(Double price) {
        return price * 0.75;
    }
}
