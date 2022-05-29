public class EggPudding extends MilkTeaDecorator {

    protected EggPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public Double Cost() {
        return 3d + super.Cost();
    }
}
