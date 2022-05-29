public abstract class MilkTeaDecorator implements IMilkTea {

    private IMilkTea iMilkTea;

    protected MilkTeaDecorator(IMilkTea inner) {
        iMilkTea = inner;
    }

    @Override
    public Double Cost() {
        return iMilkTea.Cost();
    }
}
