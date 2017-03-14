package com.asking.getting.request.normal;

import com.asking.getting.constant.Constant;
import com.asking.getting.request.GenerateRequestChain;
import com.asking.getting.request.Request;

/**
 * referer
 * 
 * @author guohanhong
 *
 */
public class RefererRequestChain implements GenerateRequestChain {

	private int code = Constant.BASE;

	@Override
	public int code() {
		return code;
	}

	@Override
	public void doRequest(Request request) {
		if(request.referer() != null){
			request.header(Constant.REFERER, request.referer());
		}
	}

	@Override
	public int compareTo(GenerateRequestChain object) {
		return object.code() > this.code() ? -1 : 1;
	}

	@Override
	public String name() {
		return "RefererRequestChain";
	}
}
