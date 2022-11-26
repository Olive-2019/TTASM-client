package com.ttasm.client.boundary;
import com.ttasm.client.pojo.Orders;
import com.ttasm.client.pojo.Train_Number;
import com.ttasm.client.dao.OrdersMapper;
import com.ttasm.client.dao.TicketMapper;
import com.ttasm.client.dao.Train_NumberMapper;
import com.ttasm.client.pojo.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Return")
@CrossOrigin("http://localhost:63342")
public class Return {

    @Autowired
    private TicketMapper ticketMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private Train_NumberMapper train_numberMapper;
    @RequestMapping("get_all_orders")
    public List<String> get_all_orders(String client_name){
        List<Orders> orders = ordersMapper.selectAll();
        System.out.println(orders.size());
        List<String> ret=new ArrayList<>();
        for (Orders order : orders) {
            System.out.println(orders.get(0).getTicketId());
            Ticket ticket = ticketMapper.selectByPrimaryKey(order.getTicketId());
            System.out.println(ticket.getTicketId()+" "+ticket.getTrainNumber());
            Train_Number train_number = train_numberMapper.selectByPrimaryKey(ticket.getTrainNumber());
            String str = ticket.getTicketId() + " " + train_number.getStartingStation() + "->" + train_number.getEndingStation() + " " + train_number.getStartingTime();
            ret.add(str);
        }
        return ret;
    }
    @RequestMapping("return_ticket")
    public void return_ticket(String ticket_id){
        ticketMapper.updateState(ticket_id,"for sale");
        ordersMapper.deleteByPrimaryKey(ticket_id);
    }

}
