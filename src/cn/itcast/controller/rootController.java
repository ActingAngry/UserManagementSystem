package cn.itcast.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.tools.ant.types.resources.LogOutputResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.pojo.User;
import cn.itcast.pojo.UserVo;
import cn.itcast.service.rootService;

@Controller
@RequestMapping("/root")
public class rootController {
	@Resource(name="rootService")
	private rootService uService;
	
	@RequestMapping("/Logout")
	public String Logout(HttpSession httpSession) {
		httpSession.setAttribute("root", null);
		return "redirect:../jsp/LoginPage.jsp";
	}
	
	@RequestMapping(value="/queryUser")
	public String queryUser(Model model,UserVo userVo) {
		List<User> userList = uService.queryUser(null);
		model.addAttribute("userList", userList);
		return "../jsp/root/index.jsp";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		uService.addUser(user);
		return "redirect:/root/queryUser";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(int id) {
		uService.deleteUser(id);
		return "redirect:/root/queryUser";
	}
	
	@RequestMapping("/editUser")
	public ModelAndView editUser(int id) {
		ModelAndView modelAndView = new ModelAndView();
		User user = uService.editUser(id);
		modelAndView.addObject("updateUser", user);
		modelAndView.setViewName("../jsp/root/editUser.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User user) {
		uService.updateUser(user);
		return "redirect:/root/queryUser";
	}
}
