/**
 * 
 */
package com.iamVip.HttpWeb.rs.adapter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.iamVip.HttpWeb.rs.c.IAPP;
import com.iamVip.HttpWeb.rs.util.MethodUtil;

/**
 * @author Colin
 */
public class PrivilegeHandlerInterceptorAdapter extends HandlerInterceptorAdapter implements IAPP {

	/**
	 * 
	 */
	public PrivilegeHandlerInterceptorAdapter() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#
	 * preHandle(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		// ** 匹配到需要拦截的 URL
		if (handler instanceof HandlerMethod) {

			HandlerMethod method = (HandlerMethod) handler;
			String className = method.getBean().getClass().getName();
			String methodName = method.getMethod().getName();
			
			StringBuffer buf = new StringBuffer();
			//buf.append("RequestURI " + request.getRequestURI() + LINE);
			buf.append("RequestURL " + request.getRequestURL() + LINE);
			buf.append("Execute " + className + "." + methodName);
			System.out.println(buf);

			{ // ** 过滤掉配置忽略的请求
				boolean ignore = false;
				String all = className + "." + methodName;
				for (String line : MethodUtil.getIgnoreMethods()) {
					boolean r = line.endsWith("*") ? all.startsWith(line.substring(0, line.length() - 1)) : all.equals(line);
					if (r) {
						ignore = true;
						break;
					}
				}
				if (ignore) {
					return true;
				}
			}

			if (className.startsWith(BACKEND)) {
				// <backend-control-area>
				return this.controlURL(request, response, ONLINE_MANAGER);
				// </backend-control-area>
			}
			else if (className.startsWith(FRONTEND)) {
				// <facade-control-area>
				return this.controlURL(request, response, ONLINE_CLIENTELE);
				// </facade-control-area>
			}

			return false;
		}

		return super.preHandle(request, response, handler);
	}

	/**
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	private boolean controlURL(HttpServletRequest request, HttpServletResponse response, String sessionKey) throws IOException {

		String contextPath = request.getContextPath();

		HttpSession httpSession = request.getSession(false);
		// ** 未登录则不通过
		if (httpSession == null) {
			System.out.println("111111111111111111111111111111111111  httpSession == null");
			response.sendRedirect(contextPath);
			return false;
		}

		// ** 判断是否登录
		Object onlineObj = httpSession.getAttribute(sessionKey);
		if (onlineObj == null) {
			System.out.println("222222222222222222222222222222222222 onlineObj == null");
			response.sendRedirect(contextPath);
			return false;
		}

		// ** 最后一次访问时间大于 30 分钟
		long lastAccessed = httpSession.getLastAccessedTime();
		if (System.currentTimeMillis() - lastAccessed > 30 * 60 * 1000) {
			System.out.println("333333333333333333333333333333333333 lastAccessed > 30 * 60 * 1000");
			response.sendRedirect(contextPath);
			return false;
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#
	 * postHandle(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object,
	 * org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

		super.postHandle(request, response, handler, modelAndView);
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#
	 * afterCompletion(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object,
	 * java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

		super.afterCompletion(request, response, handler, ex);
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#
	 * afterConcurrentHandlingStarted(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		super.afterConcurrentHandlingStarted(request, response, handler);
	}

}
