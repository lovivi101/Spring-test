import com.hong.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月12日 15:25
 */
public class test {

    @Test
    public void test_AOP1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = context.getBean("UserService", UserService.class);

        userService.query();
        userService.add();
        userService.update();
        userService.delete();
    }
    @Test
    public void test_AOP2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

        UserService userService = context.getBean("UserService", UserService.class);

        userService.query();
        userService.add();
        userService.update();
        userService.delete();
    }

    @Test
    public void test_AOP3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        UserService userService = context.getBean("UserService", UserService.class);
        userService.query();
        userService.add();
        userService.update();
        userService.delete();
    }
}
