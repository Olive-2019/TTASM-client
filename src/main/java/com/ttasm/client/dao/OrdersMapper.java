package com.ttasm.client.dao;

import com.ttasm.client.pojo.Orders;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper

public interface OrdersMapper {
    @Delete("delete from orders where `ticket_ID`=#{ticketId}")
    int deleteByPrimaryKey(String ticketId);

    @Insert("insert into orders values(#{ticketId},#{clientName},#{state})")
    int insert(Orders row);

    @Select("select * from orders where `ticket_ID`=#{ticketId}")
    Orders selectByPrimaryKey(String ticketId);
    @Select("select * from orders where `client_name`=#{client_name} and `state`='completed'")
    List<Orders> selectByClient(String client_name);
    @Select("select * from orders")
    List<Orders> selectAll();

    @Update("update orders set `client_name`=#{clientName},`state`=#{state} where `ticket_ID`=#{ticketId}")
    int updateByPrimaryKey(Orders row);
    @Update("update orders set `state`=#{state} where `ticket_ID`=#{ticket_ID}")
    int updateState(String ticket_ID,String state);
}