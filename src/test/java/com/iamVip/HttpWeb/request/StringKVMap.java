/**
 * 
 */
package com.iamVip.HttpWeb.request;

import java.util.HashMap;

/**
 * @author Colin
 */
public class StringKVMap extends HashMap<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1170132476559908395L;

	public StringKVMap add(String key, String value) {
		this.put(key, value);
		return this;
	}

}
