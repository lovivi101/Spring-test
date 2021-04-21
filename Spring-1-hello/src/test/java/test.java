import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月06日 15:20
 */
public class test {
    @Test
    public void hello(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");

        hello hello = (hello) Context.getBean("hello");

        System.out.println(hello.toString());
    }


}
