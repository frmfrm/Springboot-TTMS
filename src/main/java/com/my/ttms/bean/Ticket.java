package com.my.ttms.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ticket implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_id
     *
     * @mbggenerated
     */
    private Long ticketId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.seat_id
     *
     * @mbggenerated
     */
    private Integer seatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.studio_id
     *
     * @mbggenerated
     */
    private Integer studioId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_price
     *
     * @mbggenerated
     */
    private BigDecimal ticketPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_status
     *
     * @mbggenerated
     */
    private Short ticketStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.schedule_id
     *
     * @mbggenerated
     */
    private Integer scheduleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket_locked_time
     *
     * @mbggenerated
     */
    private Date ticketLockedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.time_stamp
     *
     * @mbggenerated
     */
    private Date timeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ticket
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_id
     *
     * @return the value of ticket.ticket_id
     *
     * @mbggenerated
     */
    public Long getTicketId() {
        return ticketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_id
     *
     * @param ticketId the value for ticket.ticket_id
     *
     * @mbggenerated
     */
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.seat_id
     *
     * @return the value of ticket.seat_id
     *
     * @mbggenerated
     */
    public Integer getSeatId() {
        return seatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.seat_id
     *
     * @param seatId the value for ticket.seat_id
     *
     * @mbggenerated
     */
    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.studio_id
     *
     * @return the value of ticket.studio_id
     *
     * @mbggenerated
     */
    public Integer getStudioId() {
        return studioId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.studio_id
     *
     * @param studioId the value for ticket.studio_id
     *
     * @mbggenerated
     */
    public void setStudioId(Integer studioId) {
        this.studioId = studioId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_price
     *
     * @return the value of ticket.ticket_price
     *
     * @mbggenerated
     */
    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_price
     *
     * @param ticketPrice the value for ticket.ticket_price
     *
     * @mbggenerated
     */
    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_status
     *
     * @return the value of ticket.ticket_status
     *
     * @mbggenerated
     */
    public Short getTicketStatus() {
        return ticketStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_status
     *
     * @param ticketStatus the value for ticket.ticket_status
     *
     * @mbggenerated
     */
    public void setTicketStatus(Short ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.schedule_id
     *
     * @return the value of ticket.schedule_id
     *
     * @mbggenerated
     */
    public Integer getScheduleId() {
        return scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.schedule_id
     *
     * @param scheduleId the value for ticket.schedule_id
     *
     * @mbggenerated
     */
    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket_locked_time
     *
     * @return the value of ticket.ticket_locked_time
     *
     * @mbggenerated
     */
    public Date getTicketLockedTime() {
        return ticketLockedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket_locked_time
     *
     * @param ticketLockedTime the value for ticket.ticket_locked_time
     *
     * @mbggenerated
     */
    public void setTicketLockedTime(Date ticketLockedTime) {
        this.ticketLockedTime = ticketLockedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.time_stamp
     *
     * @return the value of ticket.time_stamp
     *
     * @mbggenerated
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.time_stamp
     *
     * @param timeStamp the value for ticket.time_stamp
     *
     * @mbggenerated
     */
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ticketId=").append(ticketId);
        sb.append(", seatId=").append(seatId);
        sb.append(", studioId=").append(studioId);
        sb.append(", ticketPrice=").append(ticketPrice);
        sb.append(", ticketStatus=").append(ticketStatus);
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", ticketLockedTime=").append(ticketLockedTime);
        sb.append(", timeStamp=").append(timeStamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}