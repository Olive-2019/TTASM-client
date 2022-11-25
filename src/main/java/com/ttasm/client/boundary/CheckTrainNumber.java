package com.ttasm.client.boundary;

import com.ttasm.client.dao.Train_NumberMapper;
import com.ttasm.client.pojo.Train_Number;
import com.ttasm.client.dao.StationMapper;
import com.ttasm.client.pojo.Station;
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
    @Autowired
    private StationMapper stationMapper;
    @RequestMapping("selectByStartingStationAndEndingStation")
    public List<Train_Number> selectByStartingStationAndEndingStation(String startingStation, String endingStation) {
        return trainNumberMapper.selectByStartingStationAndEndingStation(startingStation, endingStation);
    }
    @RequestMapping("get_all_stations")
    @CrossOrigin("http://localhost:63342")
    public List<Station> get_all_stations(){
        return stationMapper.selectAll();
    }
}
