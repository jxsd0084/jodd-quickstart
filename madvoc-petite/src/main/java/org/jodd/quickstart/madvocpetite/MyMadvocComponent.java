package org.jodd.quickstart.madvocpetite;

import jodd.madvoc.component.MadvocConfig;
import jodd.madvoc.component.MadvocListener;
import jodd.madvoc.meta.MadvocComponent;
import jodd.petite.meta.PetiteInject;

@MadvocComponent
public class MyMadvocComponent implements MadvocListener.Init {

	@PetiteInject
	MadvocConfig madvocConfig;

	@Override
	public void init() {
		System.out.println("MyMadvocComponent.init");
		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);
	}
}
