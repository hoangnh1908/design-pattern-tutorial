public class NoDiscountStrategy implements PromoteStrategy {

    @Override
    public Double DoDiscount(Double price) {
        return price;
    }
}
