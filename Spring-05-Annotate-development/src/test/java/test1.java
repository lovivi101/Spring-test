import com.hong.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 20:55
 */
public class test1 {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user.toString());
    }
}
