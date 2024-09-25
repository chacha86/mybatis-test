package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.example.demo.vo.Article;

@Mapper
public interface ArticleDao {

    void writeArticle(@Param("title") String title, @Param("body") String body);

    List<Article> getArticles();

    Article getArticleById(int id);

    void modifyArticle(@Param("id") int id, @Param("title") String title,
                       @Param("body") String body);

    @Delete("""
            DELETE FROM article
            	WHERE id = #{id}
            """)
    public void deleteArticle(int id);

    @Select("SELECT LAST_INSERT_ID()")
    public int getLastArticleId();
}
