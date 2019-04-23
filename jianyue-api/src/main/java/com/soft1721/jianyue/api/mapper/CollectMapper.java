package com.soft1721.jianyue.api.mapper;


import com.soft1721.jianyue.api.entity.Collect;
import com.soft1721.jianyue.api.entity.vo.CollectVO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public interface CollectMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "myUId", column = "my_uid"),
            @Result(property = "toId", column = "to_id")
    })
    @Select("SELECT * FROM t_like WHERE my_uid = #{myUId} AND to_id = #{toId} ")
    Collect getCollect(@Param("myUId") int myUId, @Param("toId") int toId);

    @Insert("INSERT INTO t_like (my_uid,to_id) VALUES (#{myUId},#{toId}) ")
    void insertCollect(Collect collect);

    @Delete("DELETE  FROM t_like WHERE my_uid = #{myUId} AND to_id = #{toId} ")
    void deleteCollect(@Param("myUId") int myUId,@Param("toId") int toId);

    @Results({
            @Result(property = "toId",column = "to_id"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content")
    })
    @Select("SELECT a.to_id,b.title,b.content FROM t_like a LEFT JOIN t_article b ON a.to_id=b.id WHERE a.my_uid=#{myUId}")
    List<CollectVO> getCollectByUId(int myUId);

}
