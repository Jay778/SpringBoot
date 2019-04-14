package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.Comment;
import com.soft1721.jianyue.api.entity.vo.CommentVO;

import java.util.List;

/**
 * Created by 94921 on 2019/4/8.
 */
public interface CommentService {
    /* CommentMapper接口*/
    List<CommentVO> selectCommentsByAId(int aId);

   void addComment(Comment comment);
}
