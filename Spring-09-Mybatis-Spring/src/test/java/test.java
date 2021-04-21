import com.hong.Mapper.UserMapper;
import com.hong.Mapper.UserMapper_impl;
import com.hong.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月13日 9:27
 */
public class test {

    @Test
    public void Mybatis_Spring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        UserMapper user = context.getBean("User", UserMapper.class);

        for (User user1 : user.getUser()) {
            System.out.println(user1);
        }

    }
}
