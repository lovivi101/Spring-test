import hong.pojo.User;
import hong.service.UserService_impl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月06日 15:29
 */
public class test1 {
    @Test
    public void SpringTest(){

        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");

        UserService_impl mysqlUser = (UserService_impl) Context.getBean("mysqlUser");
        mysqlUser.getUser();
        UserService_impl initUser = (UserService_impl) Context.getBean("initUser");
        initUser.getUser();
    }

    @Test
    public void SpringTest1(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) Context.getBean("User");


        System.out.println(user.toString());
    }

    @Test
    public void SpringTest2(){


        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) Context.getBean("User1");

        System.out.println(user.toString());

    }
}
