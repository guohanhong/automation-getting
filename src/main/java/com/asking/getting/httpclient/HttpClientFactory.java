package com.asking.getting.httpclient;

import org.apache.http.impl.client.CloseableHttpClient;

/**
 * 多线程下载器
 * @author guohanhong
 *
 */
public class HttpClientFactory {
	
	private ThreadLocal<CloseableHttpClient> locals = new ThreadLocal<CloseableHttpClient>();
	
	public CloseableHttpClient client(){
		return locals.get();
	}
	
	public void client(CloseableHttpClient client){
		this.locals.set(client);
	}
}
