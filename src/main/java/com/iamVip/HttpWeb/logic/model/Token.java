/**
 * 
 */
package com.iamVip.HttpWeb.logic.model;

import com.iamVip.HttpWeb.rs.util.ConfigUtil;
import com.iamVip.HttpWeb.rs.util.TokenUtil;

/**
 * @author Colin
 */
public class Token extends __Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4299899503643628334L;

	/**
	 * 
	 */
	public Token() {
	}



	private String token; // TOKEN 长度32 char(32)
	private Integer clientID;
	private long timeMillis; // 有效毫秒数 System.currentTimeMillis()





	/**
	 * @return
	 */
	public static Token testOne() {
		Token instance = new Token();
		instance.token = TokenUtil.getToken();
		instance.clientID = 10000;
		instance.timeMillis = System.currentTimeMillis();
		return instance;
	}

	/**
	 * @return
	 */
	public static Token newOne(int clientID) {
		return newOne(clientID, ConfigUtil.getOffMinutes());
	}

	/**
	 * @return
	 */
	public static Token newOne(int clientID, int minutes) {
		Token instance = new Token();
		instance.token = TokenUtil.getToken();
		instance.clientID = clientID;
		instance.timeMillis = System.currentTimeMillis() + (minutes * 60 * 1000);
		return instance;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the clientID
	 */
	public Integer getClientID() {
		return clientID;
	}

	/**
	 * @param clientID the clientID to set
	 */
	public void setClientID(Integer clientID) {
		this.clientID = clientID;
	}

	/**
	 * @return the timeMillis
	 */
	public long getTimeMillis() {
		return timeMillis;
	}

	/**
	 * @param timeMillis the timeMillis to set
	 */
	public void setTimeMillis(long timeMillis) {
		this.timeMillis = timeMillis;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
