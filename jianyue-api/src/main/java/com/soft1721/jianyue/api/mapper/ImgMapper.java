package com.soft1721.jianyue.api.mapper;

import com.soft1721.jianyue.api.entity.Img;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Created by 94921 on 2019/4/8.
 */
@Component
public interface ImgMapper {
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "a_id",property = "aId"),
            @Result(column = "img_url",property = "imgUrl")
    })

    @Select("SELECT * FROM t_img WHERE a_id = #{aId} ")
    List<Img> selectImgsByAId(int aId);

    @Insert("INSERT INTO t_img(a_id,img_url) VALUES (#{aId},#{imgUrl})")
    void insertImg(Img img);
}
