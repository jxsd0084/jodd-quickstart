package com.quickstart;

import jodd.joy.core.DefaultAppCore;

public class AppCore extends DefaultAppCore {

	/**
	 * Public static reference to application core.
	 * For special cases of accessing app components
	 * outside of container.
	 */
	public static AppCore ref;

	/**
	 * Default constructor.
	 */
	public AppCore() {
		ref = this;
	}


}
