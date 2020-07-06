package com.my.ttms.Service;


import com.my.ttms.bean.Play;
import com.my.ttms.bean.Playdetail;
import com.my.ttms.dao.PlayMapper;
import com.my.ttms.dao.PlaydetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frm
 */
@Service
public class PlayDetailService {
	@Autowired
	private PlaydetailMapper playdetailMapper;

	public int add(Playdetail playdetail) {
		return playdetailMapper.insert(playdetail);
	}

	public List<Playdetail> selectAll(){
		return  playdetailMapper.selectAll();
	}
}
