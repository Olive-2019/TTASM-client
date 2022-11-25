package com.ttasm.client.dao;

import com.ttasm.client.pojo.Station;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface StationMapper {

    @Select("select * from station")
    List<Station> selectAll();

}
