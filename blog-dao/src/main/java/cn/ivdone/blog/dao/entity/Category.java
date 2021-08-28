package cn.ivdone.blog.dao.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("blog_category")
public class Category {

    @TableId(type = IdType.AUTO)
    private Long id ;

    private String name ;
}
