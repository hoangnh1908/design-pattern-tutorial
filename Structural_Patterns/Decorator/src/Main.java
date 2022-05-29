public class Main {
    public static void main(String[] args) {
        EggPudding milkTea = new EggPudding(new Bubble(new BlackSugar(new MilkTea())));
        System.out.println(milkTea.Cost());
    }
}
