/**
 * 
 */
package com.iamVip.HttpWeb.logic.model;

import com.iamVip.HttpWeb.rs.ref.RandomString;

/**
 * @author Colin
 */
public class Clientele extends __Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5011280047800644852L;

	/**
	 * 
	 */
	public Clientele() {
	}



	private Integer clientID;
	private String clientName; // 客户名称 最大长度96 不能为空 varchar(96)
	private String company; // 公司名称 最大程度 128 varchar(128)
	private String link; // 公司网址 最大程度 128 varchar(128)
	private Integer maxTemplate; // 拥有JSON模版数量 默认10 最大9999 tinyint(4)
	private String dateTime; // 创建日期 char(19) yyyy-MM-dd HH:mm:ss
	private Integer status; // 1->normal 0->deleted





	/**
	 * @return
	 */
	public static Clientele testOne() {
		Clientele instance = new Clientele();
		instance.clientName = RandomString.random();
		instance.company = RandomString.random();
		instance.link = "http://" + RandomString.random() + ".com";
		instance.maxTemplate = 10;
		instance.status = 1;
		return instance;
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
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
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
	 * @return the maxTemplate
	 */
	public Integer getMaxTemplate() {
		return maxTemplate;
	}

	/**
	 * @param maxTemplate the maxTemplate to set
	 */
	public void setMaxTemplate(Integer maxTemplate) {
		this.maxTemplate = maxTemplate;
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
