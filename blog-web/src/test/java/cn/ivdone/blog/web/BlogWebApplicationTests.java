package cn.ivdone.blog.web;

import cn.ivdone.blog.dao.entity.User;
import cn.ivdone.blog.dao.mapper.UserMapper;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("cn.ivdone.blog.dao.mapper")
class BlogWebApplicationTests {

    @Autowired
    private UserMapper userMapper ;

    @Test
    void contextLoads() {
    }

    @Test
    void select(){
       List<User> users =  userMapper.selectList(null)  ;

       for (User user : users){
           System.out.println(JSON.toJSONString(user));
       }

       System.out.println(users.size());
    }

    @Test
    void selectOne(){
        User user = userMapper.findByUsername("xy") ;
        System.out.println(JSON.toJSONString(user));
    }

}
