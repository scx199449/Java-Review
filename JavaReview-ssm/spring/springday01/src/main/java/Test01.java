import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-day001.xml");
        Tell tell = (Tell) context.getBean("tell");
        tell.say();
        tell.saynumber();
    }
}
