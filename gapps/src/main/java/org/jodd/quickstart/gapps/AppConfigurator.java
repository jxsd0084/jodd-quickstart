package org.jodd.quickstart.gapps;

import jodd.madvoc.config.AutomagicMadvocConfigurator;

/**
 * Custom configurator. We need to 'narrow' the entries that are being
 * scanned in order to be able to run this web app in IDE.
 * This is an _alternative_ way where you need to create new class for
 * custom configurator. If you just want to change the behavior of default
 * instance, just see {@link org.jodd.quickstart.gapps.AppWebApplication#configure(jodd.madvoc.config.MadvocConfigurator)}.
 */
public class AppConfigurator extends AutomagicMadvocConfigurator {

	public AppConfigurator() {
		super();

		String name = this.getClass().getPackage().getName();

		// just scan Jodd classes and classes that belongs to this application
		setIncludedEntries("jodd.*", name + ".*");
	}

}