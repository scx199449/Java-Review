package InterfaceAndAbstractDemo;
//接口
public interface HandleForCar {
    //接口中只能定义常量属性(final修饰的):因为接口中默认属性都是public static final修饰的
    String intro = "我是汽车的一个接口";
    String createDate = "19900101";

    //接口中只能存在方法的声明，不能存在方法的实现
    //加几号油
    public int OilNumber();
    //加汽油、柴油、清洁能源
    public String OilType();
    //汽车能源属性
    public String CarType();
    //汽车品牌
    public String CarBrand();

}
