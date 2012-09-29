package org.jodd.quickstart.madvoc;

import jodd.madvoc.WebApplication;

/**
 * Custom web application. It is a good practice to
 * extend default web application, since in most cases
 * it will be overridden. Here you can register Madvoc
 * components or initialize your web application.
 *
 * todo customize Madvoc for your needs
 */
public class AppWebApplication extends WebApplication {

	@Override
	protected void initWebApplication() {
		System.out.println("Welcome to Madvoc!");

		// todo customize madvoc scanning path, e.g.:
		//ClassFinder.setSystemJars();

		super.initWebApplication();
	}
}
