package cn.zgyt.basic.dao;

import cn.zgyt.basic.bean.Article;
import cn.zgyt.basic.bean.ArticleQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleDao {
    int countByExample(ArticleQuery example);

    int deleteByExample(ArticleQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBs(ArticleQuery example);

    List<Article> selectByExample(ArticleQuery example);

    Article selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleQuery example);

    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleQuery example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleQuery example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}