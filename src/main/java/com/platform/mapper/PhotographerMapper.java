package com.platform.mapper;

import com.platform.entity.Photographer;
import org.apache.ibatis.annotations.Select;

public interface PhotographerMapper {
    @Select("select * from photographer where photographerID = #{id}")
    Photographer getById(int id);

    @Select("select * from photographer where account = #{account}")
    Photographer getByAccount(String account);
}
