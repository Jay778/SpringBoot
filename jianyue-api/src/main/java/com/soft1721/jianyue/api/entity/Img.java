package com.soft1721.jianyue.api.entity;

import lombok.Data;

/**
 * Created by 94921 on 2019/4/8.
 */
@Data
public class Img {
    private Integer id;
    private Integer aId;
    private String imgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
