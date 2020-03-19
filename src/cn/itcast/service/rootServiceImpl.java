package cn.itcast.service;

import java.util.List;

import javax.annotation.Resource;

import cn.itcast.mapper.rootMapper;
import cn.itcast.pojo.User;
import cn.itcast.pojo.UserVo;

public class rootServiceImpl implements rootService {
	@Resource(name="rootMapper")
	private rootMapper uMapper;
	//Ìí¼Ó(×¢²á)ÓÃ»§
	@Override
	public void addUser(User user) {
		uMapper.addUser(user);
	}
	@Override
	public List<User> queryUser(UserVo userVo) {
		return uMapper.queryUser(userVo);
	}
	@Override
	public void deleteUser(int id) {
		uMapper.deleteUser(id);
	}
	@Override
	public User editUser(int id) {
		return uMapper.editUser(id);
	}
	@Override
	public void updateUser(User user) {
		uMapper.updateUser(user);
	}
	@Override
	public List<User> queryPassword(UserVo userVo) {
		return uMapper.queryPassword(userVo);
	}
	@Override
	public List<User> queryUsername(UserVo userVo) {
		return uMapper.queryUsername(userVo);
	}
	
	
}
