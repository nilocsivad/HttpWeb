/**
 * 
 */
package com.iamVip.HttpWeb.logic.model;

import com.iamVip.HttpWeb.rs.ref.RandomString;
import com.iamVip.HttpWeb.rs.util.TokenUtil;

/**
 * @author Colin
 */
public class Template extends __Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2782203728550655368L;

	/**
	 * 
	 */
	public Template() {
	}



	private Integer templateID;
	private Integer clientID;
	private Integer type; // 0->xml 1->
	private String suffix; // 请求URL 最大程度 128 不能为空 varchar(128)
	private Integer status; // 1->normal 0->deleted
	private String dateTime; // 创建日期 char(19) yyyy-MM-dd HH:mm:ss
	private String what; // 对应type指向的资源 长度未限制 tinytext





	/**
	 * @return
	 */
	public static Template testOne() {
		Template instance = new Template();
		instance.clientID = 10000;
		instance.type = 0;
		instance.suffix = RandomString.random() + "/" + RandomString.random() + "/" + RandomString.random();
		instance.status = 1;
		instance.what = instance.clientID + "-" + TokenUtil.getToken() + "-" + RandomString.random() + ".xml";
		return instance;
	}

	/**
	 * @return the templateID
	 */
	public Integer getTemplateID() {
		return templateID;
	}

	/**
	 * @param templateID the templateID to set
	 */
	public void setTemplateID(Integer templateID) {
		this.templateID = templateID;
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
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
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
	 * @return the what
	 */
	public String getWhat() {
		return what;
	}

	/**
	 * @param what the what to set
	 */
	public void setWhat(String what) {
		this.what = what;
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
