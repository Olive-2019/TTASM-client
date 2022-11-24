package com.ttasm.client.dao;

import com.ttasm.client.pojo.Train;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TrainMapper {

    @Delete("DELETE FROM train WHERE (train_ID = #{trainId})")
    int deleteByPrimaryKey(String trainId);


    @Insert("insert into train values(#{trainId}, #{capacity})")
    int insert(Train row);


    Train selectByPrimaryKey(String trainId);

    @Select("select * from train")
    List<Train> selectAll();


    @Update("UPDATE train SET capacity = #{capacity} WHERE (train_ID = #{trainId});")
    int updateByPrimaryKey(Train row);
}