package com.ttasm.client.dao;

import com.ttasm.client.pojo.Train_Number;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper

public interface Train_NumberMapper {

    @Delete("DELETE FROM train_number WHERE (train_number = #{trainNumber})")
    int deleteByPrimaryKey(String trainNumber);


    @Insert("insert into train_number values(#{train_id}, #{starting_time}, #{price}, #{train_number}, #{starting_station}, #{ending_station})")
    int insert(Train_Number row);


    Train_Number selectByPrimaryKey(String trainNumber);

    @Select("select * from train_number")
    List<Train_Number> selectAll();

    @Select("select * from train_number where starting_station = #{startingStation} and ending_station = #{endingStation}")
    List<Train_Number> selectByStartingStationAndEndingStation(String startingStation, String endingStation);

    @Update("UPDATE `train_number` SET `train_ID` = #{train_id}, `starting_time` = #{starting_time}, `price` = #{price}, `starting_station` = #{starting_station}, `ending_station` = #{ending_station} WHERE (`train_number` = #{train_number});")
    int updateByPrimaryKey(Train_Number row);


}