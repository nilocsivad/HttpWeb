/**
 * 
 */
package com.iamVip.HttpWeb.request.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iamVip.HttpWeb.request.__Request;
import com.iamVip.HttpWeb.rs.c.IAPP;

/**
 * @author Colin
 */
@Controller
@RequestMapping(value = { "web" })
public class HomeWebRequest extends __Request implements IAPP {

	/**
	 * 
	 */
	public HomeWebRequest() {
	}

	@RequestMapping(value = { "", "index", "home" })
	public ModelAndView forwardIndex(HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		return new ModelAndView("index.html", modelMap);
	}

	@RequestMapping(value = { "forward/**", "to/**" })
	public ModelAndView forward(HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		String where = super.getSuffixOfURL(request, "/web/forward/");
		return new ModelAndView(where, modelMap);
	}

}
