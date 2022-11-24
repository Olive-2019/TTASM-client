package com.ttasm.client.pojo;

public class Train {

    private String train_id;


    private Integer capacity;


    public String getTrainId() {
        return train_id;
    }

    public void setTrainId(String trainid) {
        this.train_id = trainid == null ? null : trainid.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}