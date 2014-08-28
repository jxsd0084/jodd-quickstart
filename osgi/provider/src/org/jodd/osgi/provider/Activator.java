package org.jodd.osgi.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("* Hello World Provider is being started ...");
		System.out.println("* Registering Hello World Service ...");
		bundleContext.registerService(HelloWorldService.class.getName(), new HelloWorldProvider(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("* Hello World Provider is being stopped ...");
	}
}