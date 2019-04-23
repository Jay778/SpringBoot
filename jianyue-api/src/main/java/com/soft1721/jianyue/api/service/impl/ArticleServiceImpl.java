package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.Article;
import com.soft1721.jianyue.api.entity.vo.ArticleVO;
import com.soft1721.jianyue.api.mapper.ArticleMapper;
import com.soft1721.jianyue.api.mapper.ImgMapper;
import com.soft1721.jianyue.api.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 94921 on 2019/4/8.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ImgMapper imgMapper;

    @Override
    public List<ArticleVO> selectAll() {
        List<ArticleVO> articles =articleMapper.selectAll();
        for(ArticleVO articleVO:articles){
            articleVO.setImgs(imgMapper.selectImgsByAId(articleVO.getId()));
        }
        return articles;
    }
    @Override
    public ArticleVO getArticleById(int aId) {
        return articleMapper.getArticleById(aId);
    }
   @Override
   public  void deletArticleById(int id){
        articleMapper.deletArticleById(id);
   }

    @Override
    public void insertArticle(Article article){
        articleMapper.insertArticle(article);
    }

    @Override
    public List<ArticleVO> getArticleByUId(int uId) {
        List<ArticleVO> articles=articleMapper.getArticleByUId(uId);
        for (ArticleVO articleVO:articles){
            articleVO.setImgs(imgMapper.selectImgsByAId(articleVO.getId()));
        }
        return articles;
    }
}
