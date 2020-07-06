package com.my.ttms.Service;


import com.my.ttms.bean.Play;
import com.my.ttms.bean.Studio;
import com.my.ttms.dao.PlayMapper;
import com.my.ttms.dao.StudioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frm
 */
@Service
public class PlayService {
	@Autowired
	private PlayMapper playMapper;

	public int add(Play play) {
		return playMapper.insert(play);
	}

	public List<Play> selectAll(){
		return  playMapper.selectAll();
	}
}
