package Exercise_day02;

//【练习题】02、类的成员变量
//请定义一个交通工具(Vehicle)的类，其中有:
//属性速度(speed)体积(size)等等

//方法移动(move)
//设置速度(setSpeed(int speed))
//加速speedUp
//减速speedDown()等等

//最后在测试类Vehicle中的main()中实例化一个交通工具对象
//并通过方法给它初始化speed,size的值并且通过打印出来
//另外调用加速减速的方法对速度进行改变

class Vehicle {
    int speed;
    int size;

    void move(){
        System.out.println("开车了");
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void setSize(int size){
        this.size = size;
    }

    void speedUp(){this.speed++;}
    void speedDown(){this.speed--;}

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }
}

public class Test02 {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.setSpeed(100);
        veh.setSize(100);
        System.out.println(veh.toString());

        veh.speedUp();
        System.out.println(veh.toString());

        veh.speedDown();
        veh.speedDown();
        System.out.println(veh.toString());
    }
}
