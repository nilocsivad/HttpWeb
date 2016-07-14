/**
 * 
 */
package com.iamVip.HttpWeb.rs.util;

import java.util.UUID;

/**
 * @author Colin
 */
public class TokenUtil {

	/**
	 * 
	 */
	public TokenUtil() {
	}

	public static String getToken() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
