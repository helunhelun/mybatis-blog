package cn.ivdone.blog.dao.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("blog_article")
public class Article {

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

}
