package com.my.ttms.web;

import com.my.ttms.Service.StudioService;
import com.my.ttms.bean.Studio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author frm
 * @Title: StudioController
 * @Package
 * @Description:
 * @date 2020/5/25下午10:13
 */
@Controller
@RequestMapping("/studio")
public class StudioController {
    @Autowired
    private StudioService studioService;
    @PostMapping(value = "/Search")
    public String studioSearch(String studioname) {
        List<Studio> studio = studioService.selectByStudioName(studioname);
        if(studio!= null && studio.size() != 0) {
        }
        return "";
    }
    @GetMapping(value = "/Search")
    public String studioSearch() {
        return "studiomain";
    }
}
