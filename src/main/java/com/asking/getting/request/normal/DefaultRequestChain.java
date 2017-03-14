package com.asking.getting.request.normal;

import com.asking.getting.constant.Constant;
import com.asking.getting.request.GenerateRequestChain;
import com.asking.getting.request.Request;

public class DefaultRequestChain implements GenerateRequestChain {

	private int code = Constant.ZERO;

	public static DefaultRequestChain build() {
		return new DefaultRequestChain();
	}

	@Override
	public int compareTo(GenerateRequestChain object) {
		return object.code() > this.code() ? -1 : 1;
	}

	@Override
	public int code() {
		return code;
	}

	@Override
	public void doRequest(Request request) {
		return;
	}

	@Override
	public String name() {
		return "DefaultRequestChain";
	}

}
