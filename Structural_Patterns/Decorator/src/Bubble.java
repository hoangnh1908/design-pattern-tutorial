public class Bubble extends MilkTeaDecorator {

    protected Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public Double Cost() {
        return 1d + super.Cost();
    }
}
