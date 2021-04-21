import com.hong.dao.User_Mysql_impl;
import com.hong.dao.User_init_impl;
import com.hong.service.UserService;
import com.hong.service.UserService_impl;
import org.junit.Test;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月06日 10:45
 */
public class test1 {
    @Test
    public void test(){
        UserService_impl User = new UserService_impl();
        User.setUser(new User_init_impl());
        User.getUser();

        User.setUser(new User_Mysql_impl());
        User.getUser();
    }
}
