package kh.lclass.db1.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		Object obj = req.getSession().getAttribute("SsLoginId");
		if(obj == null || obj.equals("")) {
			res.sendRedirect(req.getContextPath()+"/login");
			return false;
			// 타겟 URL요청으로 가지 않음.
		}
		
		// return true : 타겟URL의 mapping된 타겟메소드 호출하러감.
		
		//return HandlerInterceptor.super.preHandle(req, res, handler);
		
		return true;
	}
}
