import com.hong.dao.UserMapper;
import com.hong.pojo.User;
import com.hong.util.Mybatis_config;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月12日 21:57
 */
public class Test {

    @org.junit.Test
    public void Mybatis(){
        SqlSession sqlSession = Mybatis_config.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.query();

        for(User user :users){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
