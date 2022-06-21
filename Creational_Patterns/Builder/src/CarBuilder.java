import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;

public class CarBuilder implements ICarBuilder {
    private Integer wheelsBuilder;
    private SeatBelt seatBeltBuilder;
    private Windscreen windscreenBuilder;
    private Engine engineBuilder;
    private String paintBuilder;

    @Override
    public CarBuilder addWheels(Integer numberOfWheels) {
        wheelsBuilder = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder addSeatBelt(SeatBelt seatBelt) {
        seatBeltBuilder = seatBelt;
        return this;
    }

    @Override
    public CarBuilder addPaint(String paint) {
        paintBuilder = paint;
        return this;
    }


    @Override
    public CarBuilder addWindscreen(Windscreen windscreen) {
        windscreenBuilder = windscreen;
        return this;
    }

    @Override
    public CarBuilder addEngine(Engine engine) {
        engineBuilder = engine;
        return this;
    }

    @Override
    public Car builder() {
        return new Car(wheelsBuilder, seatBeltBuilder, windscreenBuilder, engineBuilder, paintBuilder);
    }

    public Integer getWheelsBuilder() {
        return wheelsBuilder;
    }

    public void setWheelsBuilder(Integer wheelsBuilder) {
        this.wheelsBuilder = wheelsBuilder;
    }

    public SeatBelt getSeatBeltBuilder() {
        return seatBeltBuilder;
    }

    public void setSeatBeltBuilder(SeatBelt seatBeltBuilder) {
        this.seatBeltBuilder = seatBeltBuilder;
    }

    public Windscreen getWindscreenBuilder() {
        return windscreenBuilder;
    }

    public void setWindscreenBuilder(Windscreen windscreenBuilder) {
        this.windscreenBuilder = windscreenBuilder;
    }

    public Engine getEngineBuilder() {
        return engineBuilder;
    }

    public void setEngineBuilder(Engine engineBuilder) {
        this.engineBuilder = engineBuilder;
    }

    public String getPaintBuilder() {
        return paintBuilder;
    }

    public void setPaintBuilder(String paintBuilder) {
        this.paintBuilder = paintBuilder;
    }
}
