import com.hong.config.config1;
import com.hong.config.config2;
import com.hong.pojo.Dog;
import com.hong.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 21:09
 */
public class test {

    
    
    /** 
    * @Description: 纯java写配置文件
    * @Param:  * @param null 
    * @return:  
    * @Author: hjx
    * @Date: 2021/4/7 
    */
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(config1.class);

        User user = context.getBean("getUser", User.class);

        System.out.println(user.toString());
    }



    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(config2.class);


        Dog dog = context.getBean("getDog", Dog.class);

        System.out.println(dog.toString());

    }
}
