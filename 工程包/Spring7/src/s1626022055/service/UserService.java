package s1626022055.service;

import s1626022055.po.User;

/**
 * 用户Service层接口
 */
public interface UserService {
	// 通过账号和密码查询用户
	public User findUser(String usercode, String password);
}
