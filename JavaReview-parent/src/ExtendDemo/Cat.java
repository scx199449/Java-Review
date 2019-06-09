package ExtendDemo;

public class Cat {
    //重载
    //在同一个类中，方法名相同，但是参数个数或者参数类型不相同，即重载
    //返回值类型不同不能构成重载
    public void eat() {
        System.out.println("我什么都不吃");
    }

    public void eat(String food){
        System.out.println("我吃了："+food);
    }
}
