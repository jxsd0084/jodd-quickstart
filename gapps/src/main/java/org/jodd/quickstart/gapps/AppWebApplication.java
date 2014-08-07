package org.jodd.quickstart.gapps;

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
 */
public class AppWebApplication extends WebApplication {

	public AppWebApplication() {
		super();
		LoggerFactory.setLoggerFactory(new SimpleLoggerFactory(Logger.Level.DEBUG));
	}

	@Override
	protected void initWebApplication() {
		System.out.println("Welcome to Madvoc!");
		super.initWebApplication();
	}

	@Override
	protected void init(MadvocConfig madvocConfig, ServletContext servletContext) {
		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);

		super.init(madvocConfig, servletContext);
	}
}