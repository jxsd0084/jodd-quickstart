package org.jodd.quickstart.httpclient;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class HttpClientExample {
	public static void main(String[] args) {
		System.out.println("Sending request to Jodd.org");

		HttpResponse httpResponse = HttpRequest.get("http://jodd.org").send();

		System.out.println("Response:");

		System.out.println(httpResponse);
	}
}