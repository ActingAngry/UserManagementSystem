package cn.itcast.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class rootInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//执行handler之后执行的
		//作系统同一异常处理，进行方法执行性能监控，在prehandle中设置一个时间点，在afterCompletion设置一个时间，两个时间点的
		//实现 系统 统一日志记录
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//在执行handler返回ModelAndView之前执行
		//如果需要向页面提供一些公用的数据或配置一些视图信息，使用此方法实现从ModelAndView入手
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//在执行handler之前执行的
		//用于用户认真检验，用户权限检验
		//return true放行
		HttpSession session = request.getSession();
		if(session.getAttribute("root")!=null) {
			return true;
		}
		response.getWriter().write("对不起，您没有权限访问管理员页面，请先登录管理员账号");
		response.sendRedirect("/UserManagementSystem/jsp/LoginPage.jsp");
		return false;
	}
	
}
