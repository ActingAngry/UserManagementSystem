package cn.itcast.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.itcast.pojo.User;
import cn.itcast.pojo.UserVo;
import cn.itcast.service.rootService;

@Controller
public class LoginController {
	@Resource(name="rootService")
	private rootService uService;
	
	@RequestMapping("/Login")
	public String Login(HttpSession httpSession,Model model,UserVo userVo) {
		if(userVo.getUser().getUsername().equalsIgnoreCase("root")&&userVo.getUser().getPassword().equalsIgnoreCase("luleili")) {
			httpSession.setAttribute("root", userVo);
			return "redirect:/root/queryUser";
		}
		List<User> username = uService.queryUsername(userVo);
		if(username.isEmpty()) {
			model.addAttribute("usernameError", "’À∫≈¥ÌŒÛªÚ’ﬂ≤ª¥Ê‘⁄");
			model.addAttribute("passwordError", "");
			return "forward:/jsp/LoginPage.jsp";
		}else {
			List<User> password = uService.queryPassword(userVo);
			if(password.isEmpty()) {
				model.addAttribute("passwordError", "√‹¬Î¥ÌŒÛ");
				model.addAttribute("usernameError", "");
				return "forward:/jsp/LoginPage.jsp";
			}else {
				httpSession.setAttribute("username", username.get(0).getNickname());
				return "redirect:/jsp/index.jsp";
			}
		}

	}
	
	@RequestMapping("/Logout")
	public String Logout(HttpSession httpSession) {
		httpSession.setAttribute("username",null);
		return "redirect:/jsp/index.jsp";
	}
	
}
