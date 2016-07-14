/**
 * 
 */
package com.iamVip.HttpWeb.rs.c;

import com.google.gson.Gson;

/**
 * @author Colin
 * 
 */
public interface IAPP {

	String LINE = "\r\n";

	String JSON_KEY = "key";
	String JSON_RESULT_KEY = "result";
	String JSON_EXTRA_KEY = "extra";

	String DEFAULT_IMAGE_SUFFIX = "jpg";

	String BACKEND = "com.iam_vip.generate_json.act.backend";
	String FRONTEND = "com.iam_vip.generate_json.act.facade";

	String ONLINE_MANAGER = "manager";
	String ONLINE_CLIENTELE = "clientele";

	Gson gson = new Gson();

}
