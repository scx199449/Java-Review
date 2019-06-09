package InterfaceAndAbstractDemo;
//抽象类
public abstract class Operation {
    //抽象类对属性没有限制
    String name;
    //static 修饰的变量是所有这个类的对象共有的，在类加载时就初始化
    //没有static修饰的变量只属于当前对象，是在对象创建时才进行初始化
    static String info;
    final static String date = "19900101";
    //抽象类中可以拥有非抽象方法
    public void info(){

    }
    //抽象类中的抽象方法没有方法体，只有声明
    public abstract void open();

    public abstract void close();
}
