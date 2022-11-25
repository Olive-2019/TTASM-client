package com.ttasm.client.boundary;

import com.ttasm.client.dao.Train_NumberMapper;
import com.ttasm.client.pojo.Train_Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("CheckTrainNumber")
@CrossOrigin("http://localhost:63342")
public class CheckTrainNumber {
    @Autowired
    private Train_NumberMapper trainNumberMapper;
    @RequestMapping("selectByStartingStationAndEndingStation")
    public List<Train_Number> selectByStartingStationAndEndingStation(String startingStation, String endingStation) {
        return trainNumberMapper.selectByStartingStationAndEndingStation(startingStation, endingStation);
    }
}
