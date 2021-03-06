package com.quickstart;

import jodd.madvoc.MadvocConfig;
import jodd.madvoc.component.MadvocComponentLifecycle;
import jodd.madvoc.meta.MadvocComponent;
import jodd.petite.meta.PetiteInject;
import jodd.servlet.CsrfShield;
import jodd.upload.impl.AdaptiveFileUploadFactory;

/**
 * Custom application Madvoc configuration. This is also a good place
 * for any other web configuration.
 * <p>
 * Additionally/alternately, 'joy.props' is also used for
 * Madvoc configuration.
 */
@MadvocComponent
public class AppMadvocConfig implements MadvocComponentLifecycle.Init {

	@PetiteInject
	MadvocConfig madvocConfig;

	@Override
	public void init() {
		madvocConfig.setFileUploadFactory(new AdaptiveFileUploadFactory());

		//madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);

		CsrfShield.setTimeToLive(0);
	}
}
