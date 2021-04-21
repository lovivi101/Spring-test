import com.hong.pojo.User;
import com.hong.pojo.User1;
import com.hong.pojo.User2;
import com.hong.pojo.User3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 15:53
 */
public class test {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

/*        System.out.println("----------byName-----");

        User user1 = context.getBean("user1", User.class);

        System.out.println(user1.toString());*/


        System.out.println("----------byType-----");

        User user2 = context.getBean("user2", User.class);
        System.out.println(user2.toString());
        user2.getCat().call();
        user2.getDog().call();



    }


    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        User1 user1 = context.getBean("User1", User1.class);

        System.out.println(user1.toString());
    }


    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");

        User2 user = context.getBean("User", User2.class);

        System.out.println(user.toString());
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");

        User3 user1 = context.getBean("User1", User3.class);

        System.out.println(user1.toString());
    }
}
