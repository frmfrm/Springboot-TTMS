package com.my.ttms.web;

import com.my.ttms.Service.PlayDetailService;
import com.my.ttms.Service.PlayService;
import com.my.ttms.Service.ScheduleService;
import com.my.ttms.Service.UserService;
import com.my.ttms.bean.Play;
import com.my.ttms.bean.Playdetail;
import com.my.ttms.bean.Schedule;
import com.my.ttms.bean.User;
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
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @PostMapping(value = "/ScheduleSearch")
    @ResponseBody
    public Response studioSearch(Integer playid) {
        Response response = new Response();
        List<Schedule> schedules = scheduleService.selectByPlayid(playid);
        if (schedules != null && schedules.size() != 0) {
            response.setData(schedules);
        }
        return response;
    }


}