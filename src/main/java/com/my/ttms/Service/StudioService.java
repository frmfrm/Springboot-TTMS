package com.my.ttms.Service;


import com.my.ttms.bean.Studio;
import com.my.ttms.bean.User;
import com.my.ttms.dao.StudioMapper;
import com.my.ttms.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frm
 */
@Service
public class StudioService {
	@Autowired
	private StudioMapper studioMapper;

	public int add(Studio studio) {
		return studioMapper.insert(studio);
	}

	public List<Studio> selectByStudioName(String studioname) {
		return studioMapper.selectByStudioName(studioname);
	}
}
