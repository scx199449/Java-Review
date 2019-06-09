package Exercise_day02;

//【练习题】01、类的成员变量
//猜数字游戏
//一个类A有一个成员变量V有一个初值100
//定义一个类对A类的成员变量V进行猜测
//如果大了则提示大了，小了则提示小了，等于则猜测成功

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        A a = new A();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入猜想的值：");
        int i;
        while (true){
            if (scanner.hasNextInt()){
                i = scanner.nextInt();
                if (i == a.v){
                    System.out.println("猜测成功");
                    break;
                }else if (i < a.v){
                    System.out.println("小了，请重新输入：");
                }else if (i > a.v){
                    System.out.println("大了，请重新输入：");
                }
            }else{
                System.out.println("输入类型不正确，请重新输入：");
            }
        }
        scanner.close();
    }

}

//私有类
class A {
    int v = 100;
}
