package org.jodd.quickstart.madvoc;

import jodd.log.LoggerFactory;
import jodd.log.impl.SimpleLogger;
import jodd.madvoc.MadvocConfig;
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
	protected void configureMadvoc(MadvocConfig madvocConfig) {
		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);
	}
}
