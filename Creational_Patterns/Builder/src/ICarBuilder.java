import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;

public interface ICarBuilder {
    CarBuilder addWheels(Integer numberOfWheels);

    CarBuilder addSeatBelt(SeatBelt seatBelt);

    CarBuilder addPaint(String paint);

    CarBuilder addWindscreen(Windscreen windscreen);

    CarBuilder addEngine(Engine engine);

    Car builder();
}
