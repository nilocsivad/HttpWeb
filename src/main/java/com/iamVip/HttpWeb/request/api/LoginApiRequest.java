/**
 * 
 */
package com.iamVip.HttpWeb.request.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iamVip.HttpWeb.request.__Request;
import com.iamVip.HttpWeb.rs.c.IAPP;

/**
 * @author Colin
 */
@Controller
@RequestMapping(value = { "api/login" })
public class LoginApiRequest extends __Request implements IAPP {

	/**
	 * 
	 */
	public LoginApiRequest() {
	}

}
