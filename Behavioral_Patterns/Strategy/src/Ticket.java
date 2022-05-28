public class Ticket {

    private Double price;
    private String name;
    private PromoteStrategy promoteStrategy;

    public Ticket(PromoteStrategy pro){
        promoteStrategy = pro;
    }

    public Ticket(){}

//  Getter, Setter
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public Double GetPromotedPrice(){
        return promoteStrategy.DoDiscount(price);
    }
}
