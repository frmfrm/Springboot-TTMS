package com.my.ttms.Service;


import com.my.ttms.bean.Play;
import com.my.ttms.bean.Schedule;
import com.my.ttms.dao.PlayMapper;
import com.my.ttms.dao.ScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frm
 */
@Service
public class ScheduleService {
	@Autowired
	private ScheduleMapper scheduleMapper;

	public int add(Schedule schedule) {
		return scheduleMapper.insert(schedule);
	}

	public List<Schedule>  selectByPlayid(Integer playId){
		return  scheduleMapper.selectByPlayName(playId);
	}
}
