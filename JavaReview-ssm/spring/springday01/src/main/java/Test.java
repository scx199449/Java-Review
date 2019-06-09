import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //1、启动框架，加载配置文件并初始化对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-day01.xml");
        //2、使用getBean()获取所需的bean
       /* HelloSpring a = (HelloSpring) context.getBean("helloSpring");
        a.print();

        HelloSpring b = (HelloSpring) context.getBean("hello");
        b.getNum();*/

        HelloSpring c = (HelloSpring) context.getBean("hello1");
        c.print();

        HelloSpring d = (HelloSpring) context.getBean("hellospring1");
        d.getNum();

        HelloSpring e = (HelloSpring) context.getBean("hello2");
        e.print();

        HelloSpring f = (HelloSpring) context.getBean("hello3");
        f.getNum();

        HelloSpring g = (HelloSpring) context.getBean("hello11");
        g.print();

        HelloSpring h = (HelloSpring) context.getBean("alias1");
        h.print();
    }
}
