package org.jodd.osgi.consumer;

import jodd.Jodd;
import jodd.bean.JoddBean;
import jodd.typeconverter.TypeConverter;
import jodd.typeconverter.TypeConverterManager;
import jodd.upload.FileUpload;
import jodd.upload.JoddUpload;
import org.jodd.osgi.provider.HelloWorldService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import java.io.File;

public class Activator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("+ Hello World Consumer bundle is being started ...");
		System.out.println("+ Getting reference of Hello World Service ...");
		ServiceReference reference = bundleContext.getServiceReference(HelloWorldService.class.getName());
		HelloWorldService helloWorldService = ((HelloWorldService)bundleContext.getService(reference));
		helloWorldService.helloWorld();

		System.out.println("+ ----------> 111");

		Jodd.initAllModules();		// this does not work

		System.out.println(Jodd.isModuleLoaded(Jodd.CORE));
		System.out.println(Jodd.isModuleLoaded(Jodd.BEAN));
		System.out.println(Jodd.isModuleLoaded(Jodd.UPLOAD));
		System.out.println(Jodd.isModuleLoaded(Jodd.MADVOC));

		System.out.println("+ ----------> 222");

		JoddBean.init();			// you need to init modules manually
		JoddUpload.init();

		System.out.println(Jodd.isModuleLoaded(Jodd.CORE));
		System.out.println(Jodd.isModuleLoaded(Jodd.BEAN));
		System.out.println(Jodd.isModuleLoaded(Jodd.UPLOAD));
		System.out.println(Jodd.isModuleLoaded(Jodd.MADVOC));


		System.out.println("+ End");
		System.out.println(TypeConverterManager.lookup(FileUpload.class));

		TypeConverter tc = TypeConverterManager.lookup(File.class);

		System.out.println(tc);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("+ Hello World Consumer is being stopped ...");
	}
}