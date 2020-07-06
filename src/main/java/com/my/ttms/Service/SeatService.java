package com.my.ttms.Service;


import com.my.ttms.bean.Schedule;
import com.my.ttms.bean.Seat;
import com.my.ttms.dao.ScheduleMapper;
import com.my.ttms.dao.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frm
 */
@Service
public class SeatService {
	@Autowired
	private SeatMapper seatMapper;

	public int add(Seat seat) {
		return seatMapper.insert(seat);
	}

	public List<Seat>  selectByStudioId(Integer studioId){
		return  seatMapper.selectByStudioId(studioId);
	}
}
