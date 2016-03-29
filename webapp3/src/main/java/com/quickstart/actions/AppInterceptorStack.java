package com.quickstart.actions;

import jodd.joy.madvoc.interceptor.DefaultInterceptorStack;
import jodd.madvoc.interceptor.ActionInterceptorStack;
import jodd.madvoc.interceptor.EchoInterceptor;

public class AppInterceptorStack extends ActionInterceptorStack {

	public AppInterceptorStack() {

		super(
			MyInterceptor.class,
			EchoInterceptor.class,
			DefaultInterceptorStack.class
		);
	}
}
