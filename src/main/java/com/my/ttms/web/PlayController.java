package com.my.ttms.web;

import com.my.ttms.Service.PlayDetailService;
import com.my.ttms.Service.PlayService;
import com.my.ttms.bean.Play;
import com.my.ttms.bean.Playdetail;
import com.my.ttms.bean.Studio;
import com.my.ttms.common.Response;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author frm
 * @Title: StudioController
 * @Package
 * @Description:
 * @date 2020/5/25下午10:13
 */
@Controller
public class PlayController {
    @Autowired
    private PlayService playService;
    @Autowired
    private PlayDetailService playDetailService;

    @PostMapping(value = "/play/Search")
    @ResponseBody
    public Response studioSearch() {
        Response response = new Response();
        List<Play> plays = playService.selectAll();
        List<Playdetail> playdetails = playDetailService.selectAll();
        for (int i = 0; i <plays.size() ; i++) {
            Play play = plays.get(i);
            Playdetail playdetail = playdetails.get(i);
            play.setDirector(playdetail.getDirector());
            play.setMainactor(playdetail.getMainactor());
            play.setPlayintro(playdetail.getPlayintro());
        }
        if (plays != null && plays.size() != 0) {
            response.setData(plays);
        }
        return response;
    }

    @PostMapping(value = "/playdeatil/Search")
    public Response PlaydeatilSearch() {
        Response response = new Response();
        List<Play> plays = playService.selectAll();
        List<Playdetail> playdetails = playDetailService.selectAll();
        for (int i = 0; i <plays.size() ; i++) {
            Play play = plays.get(i);
            Playdetail playdetail = playdetails.get(i);
            play.setDirector(playdetail.getDirector());
            play.setMainactor(playdetail.getMainactor());
            play.setPlayintro(playdetail.getPlayintro());
        }
        if (plays != null && plays.size() != 0) {
            response.setData(plays);
        }
        return response;
    }
}
