package com.ttasm.client.boundary;

import com.ttasm.client.dao.TricketMapper;
import com.ttasm.client.pojo.Tricket;
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
    private TricketMapper tricketMapper;

    @RequestMapping("selectForSaleByTrainNumber")
    public List<Tricket> selectForSaleByTrainNumber(String trainNumber) {
        return tricketMapper.selectForSaleByTrainNumber(trainNumber);
    }

    @RequestMapping("buyTicket")
    public void buyTicket() {

    }
}
