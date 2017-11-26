package org.jodd.quickstart.madvoc;

import jodd.log.LoggerFactory;
import jodd.log.impl.SimpleLogger;
import jodd.madvoc.WebApp;

/**
 * Custom web application. It is a good practice to
 * extend default web application, since in most cases
 * it will be overridden. Here you can register Madvoc
 * components or initialize your web application.
 *
 * todo customize Madvoc for your needs
 */
public class AppWebApplication extends WebApp {

	public AppWebApplication() {
		super();
		LoggerFactory.setLoggerProvider(SimpleLogger.PROVIDER);
	}

	@Override
	protected void initalized() {
		// set the root package to be where the index action is
		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);
	}
}
