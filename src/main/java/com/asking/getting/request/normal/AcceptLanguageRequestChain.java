package com.asking.getting.request.normal;

import com.asking.getting.constant.Constant;
import com.asking.getting.request.GenerateRequestChain;
import com.asking.getting.request.Request;

/**
 * accept-language
 * @author guohanhong
 *
 */
public class AcceptLanguageRequestChain implements GenerateRequestChain {

	private int code = Constant.BASE;

	private String accept_language = "zh-CN,zh;q=0.8";

	@Override
	public int code() {
		return code;
	}

	@Override
	public void doRequest(Request request) {
		request.header(Constant.ACCEPT_LANGUAGE, accept_language);
	}
	
	@Override
	public int compareTo(GenerateRequestChain object) {
		return object.code() > this.code() ? -1 : 1;
	}

	@Override
	public String name() {
		return "AcceptLanguageRequestChain";
	}
}
