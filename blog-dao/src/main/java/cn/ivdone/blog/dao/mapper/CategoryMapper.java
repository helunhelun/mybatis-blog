package cn.ivdone.blog.dao.mapper;

import cn.ivdone.blog.dao.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CategoryMapper extends BaseMapper<Category> {

    Category findByName(String name) ;

    void insertCategory(Category category) ;

    void deleteCategory(Category category) ;
}
