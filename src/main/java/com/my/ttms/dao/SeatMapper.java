package com.my.ttms.dao;

import com.my.ttms.bean.Seat;
import com.my.ttms.bean.SeatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int countByExample(SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int deleteByExample(SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer seatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int insert(Seat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int insertSelective(Seat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    List<Seat> selectByExample(SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    Seat selectByPrimaryKey(Integer seatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Seat record, @Param("example") SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Seat record, @Param("example") SeatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Seat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seat
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Seat record);
}