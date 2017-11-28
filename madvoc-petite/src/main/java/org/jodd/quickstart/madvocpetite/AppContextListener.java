package org.jodd.quickstart.madvocpetite;

import jodd.log.LoggerFactory;
import jodd.log.impl.SimpleLogger;
import jodd.madvoc.Madvoc;
import jodd.madvoc.MadvocContextListener;
import jodd.madvoc.MadvocServletFilter;
import jodd.madvoc.petite.PetiteWebApp;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import java.util.EnumSet;

@WebListener
public class AppContextListener extends MadvocContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		LoggerFactory.setLoggerProvider(SimpleLogger.PROVIDER);

		ServletContext servletContext = servletContextEvent.getServletContext();

		FilterRegistration filter = servletContextEvent.getServletContext().addFilter("madvoc", MadvocServletFilter.class);

		filter.addMappingForUrlPatterns(
			EnumSet.of(DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.REQUEST),
			true, "/*");

		System.out.println("AppContextListener.contextInitialized");

		madvoc = new Madvoc();

		madvoc.setWebAppClass(PetiteWebApp.class);

		madvoc.startWebApplication(servletContext);
	}


}
