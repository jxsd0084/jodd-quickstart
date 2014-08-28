package org.jodd.osgi.provider;

public class HelloWorldProvider implements HelloWorldService {

	@Override
	public void helloWorld() {
		System.out.println("Hello world");
	}


}