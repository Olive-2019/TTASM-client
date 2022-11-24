package com.ttasm.client.pojo;

public class Train_Number {

    private String train_number;

    private String train_id;

    private String starting_time;

    private Integer price;

    private String starting_station;

    private String ending_station;

    public String getTrainNumber() {
        return train_number;
    }


    public void setTrainNumber(String trainNumber) {
        this.train_number = trainNumber == null ? null : trainNumber.trim();
    }


    public String getTrainId() {
        return train_id;
    }


    public void setTrainId(String trainId) {
        this.train_id = trainId == null ? null : trainId.trim();
    }


    public String getStartingTime() {
        return starting_time;
    }


    public void setStartingTime(String startingTime) {
        this.starting_time = startingTime == null ? null : startingTime.trim();
    }

    public Integer getPrice() {
        return price;
    }


    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStartingStation() {
        return starting_station;
    }

    public void setStartingStation(String startingStation) {
        this.starting_station = startingStation == null ? null : startingStation.trim();
    }

    public String getEndingStation() {
        return ending_station;
    }

    public void setEndingStation(String endingStation) {
        this.ending_station = endingStation == null ? null : endingStation.trim();
    }
}