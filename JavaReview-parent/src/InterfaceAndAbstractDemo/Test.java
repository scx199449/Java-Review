package InterfaceAndAbstractDemo;

public class Test {
    public static void main(String[] args) {
          //抽象类不能直接实例化
        //Operation operation = new Operation();错误实例
        Operation operation = new Operation() {
            @Override
            public void open() {
                System.out.println("我是抽象类的匿名子类中的open实现");
            }

            @Override
            public void close() {
                System.out.println("我是抽象类的匿名子类中的close实现");
            }
        };
        operation.open();
        operation.close();
        operation.name = "匿名子类";
        operation.info = "hahaha";
        System.out.println(operation.name);
        System.out.println(operation.info);

        Computer computer = new Computer();
        computer.open();
        computer.close();

    }
}
