import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;

public class Car {
    private Integer wheels;
    private SeatBelt seatBelt;
    private Windscreen windscreen;
    private Engine engine;
    private String paint;

    public Car(Integer wheels, SeatBelt seatBelt, Windscreen windscreen, Engine engine, String paint) {
        this.wheels = wheels;
        this.seatBelt = seatBelt;
        this.windscreen = windscreen;
        this.engine = engine;
        this.paint = paint;
    }

    @Override
    public String toString() {
        return
                "wheels     =" + "\t" + wheels + "\n" +
                        "seatBelt   =" + "\t" + seatBelt.getName() + "\n" +
                        "windscreen =" + "\t" + windscreen.getName() + "\n" +
                        "engine     =" + "\t" + engine.getName() + "\n" +
                        "paint      =" + "\t" + paint;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public SeatBelt getSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(SeatBelt seatBelt) {
        this.seatBelt = seatBelt;
    }

    public Windscreen getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }
}
