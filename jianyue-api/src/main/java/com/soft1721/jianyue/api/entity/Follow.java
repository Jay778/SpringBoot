package com.soft1721.jianyue.api.entity;

import lombok.Data;

/**
 * Created by 94921 on 2019/4/10.
 */
@Data
public class Follow {
    private Integer id;
    private Integer fromUId;
    private Integer toUId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromUId() {
        return fromUId;
    }

    public void setFromUId(Integer fromUId) {
        this.fromUId = fromUId;
    }

    public Integer getToUId() {
        return toUId;
    }

    public void setToUId(Integer toUId) {
        this.toUId = toUId;
    }
}
