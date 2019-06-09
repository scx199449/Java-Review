package InterfaceAndAbstractDemo;

public class PoseChe implements HandleForCar {
    @Override
    public int OilNumber() {
        return 98;
    }

    @Override
    public String OilType() {
        return "汽油";
    }

    @Override
    public String CarType() {
        return "A类";
    }

    @Override
    public String CarBrand() {
        return "莱肯";
    }
}
