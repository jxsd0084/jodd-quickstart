package org.jodd.quickstart.madvocpetite;

import jodd.madvoc.MadvocConfig;
import jodd.madvoc.component.MadvocComponentLifecycle;
import jodd.madvoc.meta.MadvocComponent;
import jodd.petite.meta.PetiteInject;

@MadvocComponent
public class MyMadvocComponent implements MadvocComponentLifecycle.Init {

	@PetiteInject
	MadvocConfig madvocConfig;

	@Override
	public void init() {
		System.out.println("MyMadvocComponent.init");
		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);
	}
}
