package cn.ivdone.blog.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


@Data
@TableName("blog_user")
public class User {

    private Long id ;

    /**
     * 用户名
     */
    private String username ;

    /**
     * 登陆密码
     */
    private String password ;

    /**
     * 昵称
     */
    private String nickname ;

    /**
     * 是否激活
     */
    private boolean is_active ;

    /**
     * 是否员工
     */
    private boolean is_stuff ;

    /**
     * firstname
     */
    private String firstname ;

    /**
     * lastname
     */
    private String lastname ;

    /**
     * 创建时间
     */
    private Date create_time ;

    /**
     * 邮箱
     */
    private String email ;
}
