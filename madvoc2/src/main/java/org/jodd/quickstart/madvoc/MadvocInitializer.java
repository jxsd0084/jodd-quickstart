package org.jodd.quickstart.madvoc;

import jodd.madvoc.MadvocServletFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;
import java.util.Set;

public class MadvocInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext sc) throws ServletException {
		System.out.println("+++ Hello Servlets 3.0");

		FilterRegistration filter = sc.addFilter("madvoc", MadvocServletFilter.class);

		filter.setInitParameter("madvoc.webapp", "org.jodd.quickstart.madvoc.AppWebApplication");

		EnumSet NON_ASYNC_DISPATCHER_TYPES =
			EnumSet.of(DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.REQUEST);

		filter.addMappingForUrlPatterns(NON_ASYNC_DISPATCHER_TYPES, true, "/*");

		System.out.println("+++ MADVOC FILTER");
	}
}

