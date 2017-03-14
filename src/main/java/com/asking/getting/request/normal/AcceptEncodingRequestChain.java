package com.asking.getting.request.normal;

import com.asking.getting.constant.Constant;
import com.asking.getting.request.GenerateRequestChain;
import com.asking.getting.request.Request;

/**
 * accept-encoding
 * 
 * @author guohanhong
 *
 */
public class AcceptEncodingRequestChain implements GenerateRequestChain {

	private int code = Constant.UNUSE;

	private String acceptEncoding = "gzip, deflate, sdch, br";

	@Override
	public int code() {
		return code;
	}

	@Override
	public void doRequest(Request request) {
		request.header(Constant.ACCEPT_ENCODING, acceptEncoding);
	}

	@Override
	public int compareTo(GenerateRequestChain object) {
		return object.code() > this.code() ? -1 : 1;
	}

	@Override
	public String name() {
		return "AcceptEncodingRequestChain";
	}

}
