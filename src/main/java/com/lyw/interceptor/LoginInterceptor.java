package com.lyw.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("userId");
		Integer adminId = (Integer) session.getAttribute("adminId");
		
		if(userId==null && adminId == null){
			response.sendRedirect("/lyw/user/index.do");
			return false;
		}
		return super.preHandle(request, response, handler);
	}
}
