package s1626022055.dao;

import org.apache.ibatis.annotations.Param;

import s1626022055.po.User;
/**
 * 用户DAO层接口
 */
public interface UserDao {
	/**
	 * 通过账号和密码查询用户
	 */
	public User findUser(@Param("usercode") String usercode,
			                @Param("password") String password);
}
