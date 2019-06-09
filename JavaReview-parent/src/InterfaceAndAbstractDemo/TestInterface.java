package InterfaceAndAbstractDemo;

public class TestInterface {
    public static void main(String[] args) {
        PoseChe poseChe = new PoseChe();
        //poseChe.intro = "111";错误示范
        System.out.println(HandleForCar.intro);
        System.out.println(poseChe.CarBrand() + "使用#"+poseChe.OilNumber()+"号"+poseChe.OilType());

    }
}
