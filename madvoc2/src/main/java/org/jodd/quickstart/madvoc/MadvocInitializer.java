package org.jodd.quickstart.madvoc;

import jodd.madvoc.MadvocContextListener;
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

		sc.addListener(MadvocContextListener.class);

		sc.setInitParameter("madvoc.webapp", AppWebApplication.class.getName());

		FilterRegistration filter = sc.addFilter("madvoc", MadvocServletFilter.class);

		filter.addMappingForUrlPatterns(
			EnumSet.of(DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.REQUEST),
			true, "/*");

		System.out.println("+++ Done.");
	}
}

