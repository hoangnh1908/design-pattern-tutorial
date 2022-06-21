import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, new SeatBelt("asd"), new Windscreen("b"), new Engine("c"), "blue");
        System.out.println(car.toString());

        System.out.println("--------------------------------------------------------");

        Car carBuilder = new CarBuilder()
                .addWheels(1)
                .addSeatBelt(new SeatBelt("seatBelt"))
                .addWindscreen(new Windscreen("windscreen"))
                .addEngine(new Engine("Engine"))
                .addPaint("paint")
                .builder();

        System.out.println(carBuilder.toString());
    }
}
