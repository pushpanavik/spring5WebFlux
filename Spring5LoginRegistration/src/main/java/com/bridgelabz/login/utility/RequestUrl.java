package com.bridgelabz.login.utility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class RequestUrl {
	
	private static String getRequestParameters(URI requestPath) throws MalformedURLException {
		URL requestUrl = requestPath.toURL();
		System.out.println(requestUrl.getProtocol()+"://"+requestUrl.getHost()+":"+requestPath.getPort()+"/");
		return requestUrl.getProtocol()+"://"+requestUrl.getHost()+":"+requestPath.getPort()+"/";
	}

	public static String getVerificationLink(URI requestPath) throws MalformedURLException {
		String request = RequestUrl.getRequestParameters(requestPath);
		return request+"activeuser";
	}

}
