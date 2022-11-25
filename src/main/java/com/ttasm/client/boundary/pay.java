package com.ttasm.client.boundary;
import com.ttasm.client.pojo.Orders;
import com.ttasm.client.dao.TicketMapper;
import com.ttasm.client.dao.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Pay")
@CrossOrigin("http://localhost:63342")
public class pay {
    @Autowired
    private TicketMapper ticketMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @RequestMapping("lock_ticket")
    public void lock_ticket(String ticket_id,String client_name){
        ticketMapper.updateState(ticket_id,"locked");
        Orders order=new Orders();
        order.setClientName(client_name);
        order.setState("unpaid");
        order.setTicketId(ticket_id);
        ordersMapper.insert(order);
    }
    @RequestMapping("buy_ticket")
    public void buy_ticket(String ticket_id){
        ticketMapper.updateState(ticket_id,"sold out");
        ordersMapper.updateState(ticket_id,"completed");
    }
    @RequestMapping("unlock_ticket")
    public void unlock_ticket(String ticket_id){
        ticketMapper.updateState(ticket_id,"for sale");
        ordersMapper.deleteByPrimaryKey(ticket_id);
    }
}
