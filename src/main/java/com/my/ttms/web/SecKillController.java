package com.my.ttms.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.my.ttms.Service.SeatService;
import com.my.ttms.Service.StudioService;
import com.my.ttms.bean.Seat;
import com.my.ttms.bean.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author frm
 * @Title: StudioController
 * @Package
 * @Description:
 * @date 2020/5/25下午10:13
 */
@Controller
public class SecKillController {
    @Autowired
    private SeatService seatService;
    @PostMapping(value = "/pay")
    public String studioSearch(HttpSession session,@RequestBody Seats s) {
       //s: {"seat":[{"row":"5","col":"5"},{"row":"5","col":"6"},{"row":"5","col":"7"}],
        // "scheduleid":"5","studio":"1","price":"45","userid":null,"count":"3"}
        System.err.println(session.getAttribute("user") + "===========");

        List<Map>  seats =  s.getSeat();
        for (int i = 0; i < seats.size(); i++) {
            Seat seat = new Seat(s.getStudio(),Integer.parseInt(seats.get(i).get("row").toString()),Integer.parseInt(seats.get(i).get("col").toString()),0);
            System.err.println(seat);
            System.err.println(seatService.updateStatus(seat));
        }
        return "/index";
    }
//    seat:seat,
//    scheduleid:scheduleid,
//    studio:studio,
//    price:price,
//    userid:localStorage.getItem('useridLocal'),
//    count:count
//    int sum = 0;
//		for (int i = 0;i<seats.size();i++) {
//        JSONObject j = seats.getJSONObject(i);
//        String row = j.getString("row");
//        String col = j.getString("col");
//        List<Seat> list = new SeatSrv().Fetch(" studio_id = '"+Integer.valueOf(studio)+"'" + " and seat_row = '"+Integer.valueOf(row)+"'" + " and seat_column = '"+Integer.valueOf(col)+"'");
//        Seat seat = list.get(0);
//        seat.setStatus(0);
//        int m = new SeatSrv().modify(seat);
//        int seatid = seat.getId();
//
//        int ticket_id = new Ticketsrc().selectBy(seatid, Integer.valueOf(scheduleid), Integer.valueOf(studio));
//        //public Sale( int empId, java.util.Date date, float d, int change, int type, int status) {
//
//
//        Date  date = new Date();   //获取本机时间
//        DateChange change = new DateChange();
//        Timestamp time  = change.utilChangeToSql(date);
//        //Sale sale  = new Sale(0, time, (float)1, 2, 1, 0) ;
//        Sale sale = new Sale(Integer.valueOf(userid),time,Integer.valueOf(count)*Float.parseFloat(price),1,1,1);
//        int n = new SaleSrc().add(sale);
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=utf-8");
//        System.out.println("sale"+n);
//        if(n ==1) {
//            out.write("成功");
//        }else {
//            out.write("失败");
//        }
//        out.close();

}
