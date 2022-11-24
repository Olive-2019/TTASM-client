package com.ttasm.client.dao;

import com.ttasm.client.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface OrdersMapper {

    int deleteByPrimaryKey(String ticketId);


    int insert(Orders row);


    Orders selectByPrimaryKey(String ticketId);


    List<Orders> selectAll();


    int updateByPrimaryKey(Orders row);
}