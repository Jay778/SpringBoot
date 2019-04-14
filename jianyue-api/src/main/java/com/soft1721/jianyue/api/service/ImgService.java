package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.Img;

import java.util.List;

/**
 * Created by 94921 on 2019/4/8.
 */
public interface ImgService {
    /* ImgMapper接口*/
    List<Img> selectImgsByAId(int aId);

    void insertImg(Img img);
}
