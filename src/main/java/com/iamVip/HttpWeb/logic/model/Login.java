/**
 * 
 */
package com.iamVip.HttpWeb.logic.model;

import com.iamVip.HttpWeb.rs.ref.RandomString;
import com.iamVip.HttpWeb.rs.util.MD5Util;

/**
 * @author Colin
 */
public class Login extends __Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = -50305927037727745L;

	/**
	 * 
	 */
	public Login() {
	}



	private String loginName; // 登录名 最大长度48 不能为空 varchar(48)
	private String password; // 密码 MD5加密存储 不能为空 char(32)
	private Integer clientID;
	private Integer type; // 1->Email 2->QQ 3->weibo 4->facebook 5->loginName
	private String dateTime; // 创建日期 char(19) yyyy-MM-dd HH:mm:ss
	private Integer status; // 1->normal 0->unauthorized 2->expired





	/**
	 * @return
	 */
	public static Login testOne() {
		Login instance = new Login();
		instance.loginName = RandomString.random();
		instance.setPassword(instance.loginName);
		instance.clientID = 10000;
		instance.type = 5;
		instance.status = 1;
		return instance;
	}

	/**
	 * MD5加密密码
	 */
	public void password2md5() {
		this.password = MD5Util.getMD5(this.password);
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the dateTime
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
