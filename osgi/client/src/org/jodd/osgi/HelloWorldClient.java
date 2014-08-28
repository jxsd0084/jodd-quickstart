package org.jodd.osgi;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.launch.Framework;
import org.osgi.framework.launch.FrameworkFactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {
		FrameworkFactory frameworkFactory = ServiceLoader
				.load(FrameworkFactory.class)
				.iterator().next();

		Map<String, String> config = new HashMap<>();
		config.put(Constants.FRAMEWORK_STORAGE_CLEAN, Constants.FRAMEWORK_STORAGE_CLEAN_ONFIRSTINIT);

		Framework framework = frameworkFactory.newFramework(config);
		framework.start();

		BundleContext context = framework.getBundleContext();
		List<Bundle> installedBundles = new LinkedList<>();

		installedBundles.add(context.installBundle("file:out/production/Hello_World_Provider.jar"));
		installedBundles.add(context.installBundle("file:out/production/Hello_World_Consumer.jar"));

		for (Bundle bundle : installedBundles) {
			System.out.println(bundle.getSymbolicName());
			if (bundle.getHeaders().get(Constants.FRAGMENT_HOST) == null) {
				bundle.start();
			}
		}
	}
}