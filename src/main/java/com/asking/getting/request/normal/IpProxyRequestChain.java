package com.asking.getting.request.normal;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.asking.getting.constant.Constant;
import com.asking.getting.request.GenerateRequestChain;
import com.asking.getting.request.Request;

public class IpProxyRequestChain implements GenerateRequestChain {

	private int code = Constant.BASE;

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
		String ip = request.ip();
		if (ip != null) {
			HttpHost proxy = new HttpHost(ip, 80);
			RequestConfig requestConfig = RequestConfig.custom().setProxy(proxy).build();
			String protocol = request.protocol();
			if (protocol.equals(Constant.PROTOCOL_GET)) {
				HttpGet get = (HttpGet) request.handlerProtocol();
				get.setConfig(requestConfig);

			} else if (protocol.equals(Constant.PROTOCOL_POST)) {
				HttpPost post = (HttpPost) request.handlerProtocol();
				post.setConfig(requestConfig);
			} else {

			}
		}
	}

	@Override
	public String name() {
		return "IpProxyRequestChain";
	}

}
