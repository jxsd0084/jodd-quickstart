package org.jodd.quickstart.madvoc;

import jodd.log.Logger;
import jodd.log.LoggerFactory;
import jodd.log.impl.SimpleLoggerFactory;
import jodd.madvoc.WebApplication;
import jodd.madvoc.component.MadvocConfig;

import javax.servlet.ServletContext;

/**
 * Custom web application. It is a good practice to
 * extend default web application, since in most cases
 * it will be overridden. Here you can register Madvoc
 * components or initialize your web application.
 *
 * todo customize Madvoc for your needs
 */
public class AppWebApplication extends WebApplication {

	public AppWebApplication() {
		super();
		LoggerFactory.setLoggerFactory(new SimpleLoggerFactory(Logger.Level.DEBUG));
	}

	@Override
	protected void initWebApplication() {
		System.out.println("Welcome to Madvoc!");

		// todo customize madvoc scanning path, e.g.:
		//ClassFinder.setSystemJars();

		super.initWebApplication();
	}

	@Override
	protected void init(MadvocConfig madvocConfig, ServletContext servletContext) {

		// set the root package to be where the index action is
		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);

		super.init(madvocConfig, servletContext);
	}
}
