package Test01;

import java.util.Scanner;

//主控台
public class Application {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入操作指令:");
        while (true){
            System.out.println("1、开户，2、信息查询，3、注销学生信息，4、查询学生是否毕业，5、查询哪些班级有重名的学生");
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                switch (i){
                    case 1 :{
                        Student stu1 = new Student("张三",1001,"三年级二班",22,"男","12345678901","1994-04-06");
                        manager.createStudent(stu1);
                    }
                    break;

                    case 2 :{
                        manager.findStudentInfo(1001);
                    }
                    break;

                    case 3 :{

                    }
                    break;
                }
            }
        }

    }
}

//使用控制台操作界面，使用Scanner接收输入操作指令
//完成学生系统的开发
//可以实现学生的入学开户（不可以有重复的学号）
//学生信息查询
//学生是否毕业
//学生销户等操作
//学生：姓名，学号，班级，年龄，性别，手机号，出生日期等信息
//判断两个学生是否是同一个班级
//判断那些班级有重名的学生