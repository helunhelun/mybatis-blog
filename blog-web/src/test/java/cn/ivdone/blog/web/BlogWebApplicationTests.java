package cn.ivdone.blog.web;

import cn.ivdone.blog.dao.entity.Article;
import cn.ivdone.blog.dao.entity.Category;
import cn.ivdone.blog.dao.entity.User;
import cn.ivdone.blog.dao.mapper.ArticleMapper;
import cn.ivdone.blog.dao.mapper.CategoryMapper;
import cn.ivdone.blog.dao.mapper.UserMapper;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.VerificationOverTimeImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;
import java.util.List;

@SpringBootTest
//@ComponentScan(basePackages =
//        {"cn.ivdone.blog.dao",
//                "cn.ivdone.blog.common"})
@MapperScan("cn.ivdone.blog.dao.mapper")
class BlogWebApplicationTests {

    @Autowired
    private UserMapper userMapper ;

    @Autowired
    private ArticleMapper articleMapper ;

    @Autowired
    private CategoryMapper categoryMapper ;

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

    @Test
    void selectArticleByPostId(){
        Article article = articleMapper.findByPostId(1000L) ;
        System.out.println(JSON.toJSONString(article));
    }

    @Test
    void insertArticle(){
        Article article = new Article() ;
        User user = userMapper.findByUsername("losha") ;
//        User user = new User() ;
//        user.set_active(true);
//        user.set_stuff(true);
//        user.setEmail("helun@tju.edu.cn");
//        user.setFirstname("he");
//        user.setUsername("lunlun");
//        user.setNickname("论论");
//        user.setPassword("123");
        article.setBody("test-body");
        // article.setLike(1L);
        article.setCreateTime(new Date());
        article.setModifyTime(new Date());
        article.setPost_id(1000L);
        article.setTitle("hello");
        article.setSummary("test-summary");
        article.setViews(100L);
        article.setStatus("p");
        article.setUser(user);

        articleMapper.insertArticle(article) ;
    }

    @Test
    void selectByCategoryName(){
        //Category category = categoryMapper.findByName("springboot") ;

        Category category = new Category() ;
        category.setName("linux");

        categoryMapper.insertCategory(category);

        System.out.println(JSON.toJSONString(category));
    }

}
