package cn.ssms.service;

import cn.ssms.dao.UserMapper;
import cn.ssms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public User findUserByLoginName(String username) {
		System.out.println("findUserByLoginName call!");
		return userMapper.findUserByLoginName(username);
	}

}
