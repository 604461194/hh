package com.accp.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.accp.biz.IUserBiz;
import com.accp.pojo.Function;
import com.accp.pojo.User;

public class RBACValidateInterceptor implements HandlerInterceptor {

	private IUserBiz biz;

	public IUserBiz getBiz() {
		return biz;
	}

	public void setBiz(IUserBiz biz) {
		this.biz = biz;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		User user = (User) request.getSession().getAttribute("USER");
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/public/loginerror.html");
			return false;
		}
		// 省略其他业务过滤一万行代码 补充可以考虑权限码的验证页面有效性【扩展】
		String funcode = request.getParameter("fcode");
		// 特殊权限码处理
		if ("0".equals(funcode)) {
			return true;
		} else {
			if (funcode != null) {
				for (Function fun : user.getRole().getFunctions()) {
					if (fun.getFcode().equals(funcode)) {
						return true;
					}
				}
			}
		}
		response.sendRedirect(request.getContextPath() + "/public/syserror.html");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
