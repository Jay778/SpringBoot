package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.Article;
import com.soft1721.jianyue.api.entity.Img;
import com.soft1721.jianyue.api.entity.vo.ArticleVO;
import com.soft1721.jianyue.api.entity.vo.CommentVO;

import java.util.List;

/**
 * Created by 94921 on 2019/4/8.
 */
public interface ArticleService {
   /* ArticleService接口*/
   List<ArticleVO> selectAll();
    ArticleVO getArticleById(int aId);
    void insertArticle(Article article);
    List<ArticleVO> getArticleByUId(int uId);
    void deletArticleById(int id);

}
