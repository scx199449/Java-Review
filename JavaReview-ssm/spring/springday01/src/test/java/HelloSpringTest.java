import org.junit.Test;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class HelloSpringTest {
    //启动框架
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-day01.xml");

    @Test
    public void print() {

    }

    @Test
    public void getNum() {
    }
}