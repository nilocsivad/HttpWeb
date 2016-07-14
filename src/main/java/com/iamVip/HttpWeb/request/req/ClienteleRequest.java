/**
 * 
 */
package com.iamVip.HttpWeb.request.req;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iamVip.HttpWeb.request.__Request;
import com.iamVip.HttpWeb.rs.c.IAPP;

/**
 * @author Colin
 */
@Controller
@RequestMapping(value = { "req/clientele" })
public class ClienteleRequest extends __Request implements IAPP {

	/**
	 * 
	 */
	public ClienteleRequest() {
	}

	@ResponseBody
	@RequestMapping(value = { "query" })
	public Map<String, Object> queryLimit(HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		return super.queryLimit(request, response);
	}

}
