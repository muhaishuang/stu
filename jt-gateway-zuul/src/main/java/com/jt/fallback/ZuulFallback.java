package com.jt.fallback;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
//Component //底层利用包扫描创建实例
public class ZuulFallback implements ZuulFallbackProvider{

	@Override//
	public String getRoute() {
		return null;
	}

	@Override
	public ClientHttpResponse fallbackResponse() {
		// TODO Auto-generated method stub
		
		return new ClientHttpResponse() {
			
			@Override//设置头信息
			public HttpHeaders getHeaders() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override//设置返回内容，当出现异常时，断路器返回默认值
			public InputStream getBody() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override//
			public String getStatusText() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
