package cn.ivdone.blog.dao.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("blog_article")
public class Article {

    //@TableId(type = IdType.AUTO)
    private Long id ;

    private Long post_id ;

    private Long views ;

    private Long like ;

    private String title ;

    private String summary ;

    private String body ;

    private Date createTime ;

    private Date modifyTime ;

    private String status ;

    /**
     * 文章作者
     */
    private User user ;

    private Long user_id ;

}
