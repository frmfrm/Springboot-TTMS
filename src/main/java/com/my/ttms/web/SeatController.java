package com.my.ttms.web;

import com.my.ttms.Service.ScheduleService;
import com.my.ttms.Service.SeatService;
import com.my.ttms.Service.StudioService;
import com.my.ttms.bean.Schedule;
import com.my.ttms.bean.Seat;
import com.my.ttms.bean.Studio;
import com.my.ttms.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 类CommonController.java的实现描述：通用功能的控制类
 * @author frm
 * @date 2020年5月22日下午2:42:55
 */
@Controller
public class SeatController {
    @Autowired
    private SeatService seatService;
    @Autowired
    private StudioService studioService;

    @PostMapping(value = "/SeatSearch")
    @ResponseBody
    public Response studioSearch(Integer studioId) {
        Response response = new Response();
        List<Seat> seats = seatService.selectByStudioId(studioId);
        Map<String,String> count  = new HashMap<>();
        Map<String,Object> res  = new HashMap<>();
        Studio studio = studioService.selectByStudioId(studioId);
        count.put("rowCount",studio.getStudioRowCount().toString());
        count.put("colCount",studio.getStudioColCount().toString());
        if (seats != null && seats.size() != 0) {
            res.put("seats",seats);
            res.put("count",count);
            response.setData(res);
        }
        return response;
    }


}