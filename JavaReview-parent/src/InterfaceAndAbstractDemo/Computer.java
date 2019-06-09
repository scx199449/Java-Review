package InterfaceAndAbstractDemo;

public class Computer extends Operation{
    //抽象类的子类，必须要实现抽象父类中的全部抽象方法
    @Override
    public void open() {
        System.out.println("我是定义电脑开机方式的方法");
    }

    @Override
    public void close() {
        System.out.println("我是定义电脑关机方式的方法");
    }
}
