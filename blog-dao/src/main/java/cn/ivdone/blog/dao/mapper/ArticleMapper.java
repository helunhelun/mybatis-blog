package cn.ivdone.blog.dao.mapper;

import cn.ivdone.blog.dao.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ArticleMapper extends BaseMapper<Article> {

    Article findByPostId(Long postId) ;

    void insertArticle(Article article) ;
}
