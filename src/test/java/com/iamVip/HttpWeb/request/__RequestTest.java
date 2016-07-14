/**
 * 
 */
package com.iamVip.HttpWeb.request;

import java.util.Map;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Colin
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring-listen.xml", "classpath:config/spring-servlet.xml" })
public class __RequestTest {

	private MockMvc mvc;

	@Autowired
	private WebApplicationContext wac;

	/**
	 * 
	 */
	protected __RequestTest() {
	}


	/**
	 * @param url
	 * @throws Exception
	 */
	protected void executeHttp(String url) throws Exception {
		this.executeHttp(url, 0);
	}

	/**
	 * @param url
	 * @param params com.iamVip.HttpWeb.request.StringKVMap
	 * @throws Exception
	 */
	protected void executeHttp(String url, StringKVMap params) throws Exception {
		this.executeHttp(url, 0, params);
	}

	/**
	 * @param url
	 * @param type get(0) post(1)
	 * @throws Exception
	 */
	protected void executeHttp(String url, int type) throws Exception {
		this.executeHttp(url, type, null);
	}

	/**
	 * @param url
	 * @param type get(0) post(1)
	 * @param params com.iamVip.HttpWeb.request.StringKVMap
	 * @throws Exception
	 */
	protected void executeHttp(String url, int type, StringKVMap params) throws Exception {

		MockHttpServletRequestBuilder rb = type == 0 ? MockMvcRequestBuilders.get(url) : MockMvcRequestBuilders.post(url);
		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, String> item : params.entrySet())
				rb.param(item.getKey(), item.getValue());
		}

		MvcResult result = mvc.perform(rb).andReturn();
		int status = result.getResponse().getStatus();

		this.printOut("Response Status: " + status);
		this.printOut("Response: " + result.getResponse().getContentAsString());
	}

	@Before
	public void init() {
		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	protected void printOut(String txt) {
		System.out.println(txt);
	}

}
