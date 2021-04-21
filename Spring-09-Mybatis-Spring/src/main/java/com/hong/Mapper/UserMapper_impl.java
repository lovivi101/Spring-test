package com.hong.Mapper;

import com.hong.pojo.User;
import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月13日 9:14
 */

@Data
public class UserMapper_impl implements UserMapper{


    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> getUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
