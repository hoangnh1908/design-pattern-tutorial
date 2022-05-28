import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Random random = new Random();

        System.out.println("Start getting tickets !");
        System.out.println("-----------------------");

        for (int i = 1; i <= 5; i++) {

            ticket.setName("Ticket " + i);
            ticket.setPrice(50d * i);

            GeneratePromoteStrategy(ticket, random);
            LogTicketDetails(ticket);

            GeneratePromoteStrategy(ticket, random);
            LogTicketDetails(ticket);
        }
    }

    private static void LogTicketDetails(Ticket ticket) {
        System.out.println(
                "Promoted price of " +
                        ticket.getName() +
                        " is " +
                        ticket.GetPromotedPrice() +
                        " " +
                        ticket.getPromoteStrategy() + "\n");
    }

    private static void GeneratePromoteStrategy(Ticket ticket, Random random) {
        int strategyIndex = random.nextInt(3);
        switch (strategyIndex) {
            case 0:
                ticket.setPromoteStrategy(new NoDiscountStrategy());
                break;
            case 1:
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                break;
            case 2:
                ticket.setPromoteStrategy(new HalfDiscountStrategy());
                break;
        }
    }
}
