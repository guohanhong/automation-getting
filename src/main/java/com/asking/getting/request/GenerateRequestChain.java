package com.asking.getting.request;

public interface GenerateRequestChain extends Comparable<GenerateRequestChain>{

	/**
	 * 编码顺序
	 * 
	 * @return
	 */
	public int code();

	/**
	 * @param request
	 */
	public void doRequest(Request request);
	
	public String name();
}
