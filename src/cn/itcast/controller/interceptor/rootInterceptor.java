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
		//ִ��handler֮��ִ�е�
		//��ϵͳͬһ�쳣�������з���ִ�����ܼ�أ���prehandle������һ��ʱ��㣬��afterCompletion����һ��ʱ�䣬����ʱ����
		//ʵ�� ϵͳ ͳһ��־��¼
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//��ִ��handler����ModelAndView֮ǰִ��
		//�����Ҫ��ҳ���ṩһЩ���õ����ݻ�����һЩ��ͼ��Ϣ��ʹ�ô˷���ʵ�ִ�ModelAndView����
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//��ִ��handler֮ǰִ�е�
		//�����û�������飬�û�Ȩ�޼���
		//return true����
		HttpSession session = request.getSession();
		if(session.getAttribute("root")!=null) {
			return true;
		}
		response.getWriter().write("�Բ�����û��Ȩ�޷��ʹ���Աҳ�棬���ȵ�¼����Ա�˺�");
		response.sendRedirect("/UserManagementSystem/jsp/LoginPage.jsp");
		return false;
	}
	
}
