package com.soft1721.jianyue.api.entity.vo;

import com.soft1721.jianyue.api.entity.Img;
import lombok.Data;

import java.util.List;

@Data
public class CollectVO {
    private  Integer toId;
    private String title;
    private  String content;
    private List<Img> imgs;
}
