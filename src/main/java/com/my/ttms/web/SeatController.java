package com.my.ttms.web;

import com.my.ttms.Service.ScheduleService;
import com.my.ttms.Service.SeatService;
import com.my.ttms.bean.Schedule;
import com.my.ttms.bean.Seat;
import com.my.ttms.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 类CommonController.java的实现描述：通用功能的控制类
 * @author frm
 * @date 2020年5月22日下午2:42:55
 */
@Controller
public class SeatController {
    @Autowired
    private SeatService seatService;

    @PostMapping(value = "/SeatSearch")
    @ResponseBody
    public Response studioSearch(Integer studioId) {
        Response response = new Response();
        List<Seat> seats = seatService.selectByStudioId(studioId);
        if (seats != null && seats.size() != 0) {
            response.setData(seats);
        }
        return response;
    }


}