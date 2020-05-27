package com.my.ttms.Service;


import com.my.ttms.bean.User;
import com.my.ttms.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author frm
 */
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public int add(User user) {
		return userMapper.insert(user);
	}
	public int adddetail(User user) {
	return userMapper.insert(user);
	}
	public int deleteUser(User user) {
		return userMapper.deleteByExample(user);
	}
	public int deleteById(Integer userid) {
		return userMapper.deleteByPrimaryKey(userid);
	}
	
	public int modify(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public User Find(User user) {
		return userMapper.selectByUsername(user.getUserName());
	}
	
	public User Finduser(int userid) {
		return  userMapper.selectByPrimaryKey(userid);
	}
}