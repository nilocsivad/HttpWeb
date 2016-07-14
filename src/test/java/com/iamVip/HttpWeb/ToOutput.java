/**
 * 
 */
package com.iamVip.HttpWeb;

import java.util.UUID;

/**
 * @author Colin
 */
public class ToOutput {

	/**
	 * 
	 */
	public ToOutput() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String uuid = UUID.randomUUID().toString().replace("-", "");
		System.out.println(uuid.length() + " --> " + uuid);

		String timeMillis = System.currentTimeMillis() + "";
		System.out.println(timeMillis.length() + " --> " + timeMillis);

	}

}
