import com.hong.pojo.Student;
import com.hong.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 10:13
 */
public class test {

    @Test
    public void Spring_03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());

        System.out.println(student.getProperties());
    }

    @Test
    public void Spring_04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        User user = context.getBean("user" , User.class);
        System.out.println(user.toString());

        User user1 = context.getBean("user1" , User.class);
        System.out.println(user1.toString());
    }
}
