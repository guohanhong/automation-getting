package com.asking.getting.request.normal;

import com.asking.getting.constant.Constant;
import com.asking.getting.request.GenerateRequestChain;
import com.asking.getting.request.Request;

/**
 * accept
 * 
 * @author guohanhong
 *
 */
public class AcceptRequestChain implements GenerateRequestChain {

	private int code = Constant.BASE;

	private String accept = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36";

	@Override
	public int code() {
		return code;
	}

	@Override
	public void doRequest(Request request) {
		request.header(Constant.ACCEPT, accept);
	}

	@Override
	public int compareTo(GenerateRequestChain object) {
		return object.code() > this.code() ? -1 : 1;
	}

	@Override
	public String name() {
		return "AcceptRequestChain";
	}
}
