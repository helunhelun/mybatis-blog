package cn.ivdone.blog.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("blog_user")
public class User {

    private Long id ;

    private String username ;

    private String password ;

    private String nickname ;

    private boolean is_active ;

    private boolean is_stuff ;

    private String firstname ;

    private String lastname ;

    private Data create_time ;

    private String email ;
}
