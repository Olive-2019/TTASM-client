package com.ttasm.client.pojo;

public class Ticket {

    private String ticket_id;

    private String train_number;

    private String seat;

    private String state;

    public String getTicketId() {
        return ticket_id;
    }

    public void setTicketId(String ticketId) {
        this.ticket_id = ticketId == null ? null : ticketId.trim();
    }

    public String getTrainNumber() {
        return train_number;
    }

    public void setTrainNumber(String trainNumber) {
        this.train_number = trainNumber == null ? null : trainNumber.trim();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}