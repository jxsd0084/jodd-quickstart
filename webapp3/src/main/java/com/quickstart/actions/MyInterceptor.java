package com.quickstart.actions;

import jodd.madvoc.ActionRequest;
import jodd.madvoc.interceptor.BaseActionInterceptor;

public class MyInterceptor extends BaseActionInterceptor {
	@Override
	public Object intercept(ActionRequest actionRequest) throws Exception {

		System.out.println("Hello from my interceptor!");

		return actionRequest.invoke();
	}
}
