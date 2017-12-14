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
		// todo the best thing would be to set the logger implementation as soon as possible
		LoggerFactory.setLoggerProvider(SimpleLogger.PROVIDER);
	}

	@Override
	public WebApp start() {
		// todo nothing much to do here :)
		System.out.println("Welcome to Madvoc!");
		return super.start();
	}

	@Override
	protected void configureMadvoc(MadvocConfig madvocConfig) {
		// set the root package to be where the index action is

		// todo you could put this method in any of lifecycle methods as well (init(), start()...).

		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);
	}

}
