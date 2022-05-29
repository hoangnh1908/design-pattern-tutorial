public class BlackSugar extends MilkTeaDecorator {

    protected BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public Double Cost() {
        return 2d + super.Cost();
    }
}
