package com.asking.getting.request;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.asking.getting.constant.Constant;
import com.asking.template.Template;

public class Request {

	private String protocol;

	private HttpGet get;

	private HttpPost post;

	private String url;

	private String host;

	private String referer;

	private Template template;

	private String ip;

	public String ip() {
		return ip;
	}

	public void ip(String ip) {
		this.ip = ip;
	}

	public Template template() {
		return this.template;
	}

	public void template(Template template) {
		this.template = template;
	}

	private String keyword;

	public void keyword(String keyword) {
		this.keyword = keyword;
	}
	public String keyword(){
		return this.keyword;
	}

	public void host(String host) {
		this.host = host;
	}

	public String host() {
		return this.host;
	}

	public void url(String url) {
		this.url = url;
	}

	public String url() {
		return url;
	}

	public void referer(String referer) {
		this.referer = referer;
	}

	public String referer() {
		return this.referer;
	}

	private void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public static Request build() {
		Request request = new Request();
		return request;
	}

	public Request protocol(String protocol) {
		this.setProtocol(protocol);
		return this;
	}

	public String protocol() {
		return this.protocol;
	}

	/**
	 * 由加工器加工
	 * 
	 * @return
	 */
	public Object handlerProtocol() {
		switch (protocol) {
		case Constant.PROTOCOL_GET: {
			return this.get;
		}
		case Constant.PROTOCOL_POST: {
			return this.post;
		}
		}
		return null;
	}

	/**
	 * header
	 * 
	 * @param accept
	 * @return
	 */
	public Request header(String key, String value) {
		switch (protocol) {
		case Constant.PROTOCOL_GET: {
			get.addHeader(key, value);
			break;
		}
		case Constant.PROTOCOL_POST: {
			post.addHeader(key, value);
			break;
		}
		}
		return this;
	}

	public void option() {
		switch (protocol) {
		case Constant.PROTOCOL_GET: {
			get = new HttpGet(url);
			break;
		}
		case Constant.PROTOCOL_POST: {
			post = new HttpPost(url);
			break;
		}
		}
	}
}
