package com.ttasm.client.boundary;

import com.ttasm.client.dao.TicketMapper;
import com.ttasm.client.pojo.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ManageTicket")
@CrossOrigin("http://localhost:63342")
public class ManageTicket {
    @Autowired
    private TicketMapper ticketMapper;

    @RequestMapping("selectForSaleByTrainNumber")
    public List<Ticket> selectForSaleByTrainNumber(String trainNumber) {
        return ticketMapper.selectForSaleByTrainNumber(trainNumber);
    }

    @RequestMapping("buyTicket")
    public void buyTicket() {

    }
}
