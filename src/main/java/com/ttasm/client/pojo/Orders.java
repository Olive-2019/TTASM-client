package com.ttasm.client.pojo;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.ticket_ID
     *
     * @mbg.generated
     */
    private String ticket_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.client_name
     *
     * @mbg.generated
     */
    private String client_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.ticket_ID
     *
     * @return the value of orders.ticket_ID
     *
     * @mbg.generated
     */
    public String getTicketId() {
        return ticket_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.ticket_ID
     *
     * @param ticketId the value for orders.ticket_ID
     *
     * @mbg.generated
     */
    public void setTicketId(String ticketId) {
        this.ticket_id = ticketId == null ? null : ticketId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.client_name
     *
     * @return the value of orders.client_name
     *
     * @mbg.generated
     */
    public String getClientName() {
        return client_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.client_name
     *
     * @param clientName the value for orders.client_name
     *
     * @mbg.generated
     */
    public void setClientName(String clientName) {
        this.client_name = clientName == null ? null : clientName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.state
     *
     * @return the value of orders.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.state
     *
     * @param state the value for orders.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}