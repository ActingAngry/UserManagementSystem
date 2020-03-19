package cn.itcast.mapper;

import java.util.List;

import cn.itcast.pojo.User;
import cn.itcast.pojo.UserVo;

public interface rootMapper {
	public void addUser(User user);
	public List<User> queryUser(UserVo userVo);
	public void deleteUser(int id);
	public User editUser(int id);
	public void updateUser(User user);
	public List<User> queryPassword(UserVo userVo);
	public List<User> queryUsername(UserVo userVo);
}
