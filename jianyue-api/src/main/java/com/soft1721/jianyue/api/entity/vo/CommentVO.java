package com.soft1721.jianyue.api.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by 94921 on 2019/4/8.
 */
@Data
public class CommentVO {
    private Integer Id;
    private Integer uId;
    private Integer aId;
    private String content;
    private Date commentTime;
    private String nickname;
    private String avatar;
}
