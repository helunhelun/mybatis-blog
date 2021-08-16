package cn.ivdone.blog.dao.mapper;


import cn.ivdone.blog.dao.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
//import org.springframework.stereotype.Repository;


public interface UserMapper extends BaseMapper<User> {

    User findByUsername(String username) ;
}
