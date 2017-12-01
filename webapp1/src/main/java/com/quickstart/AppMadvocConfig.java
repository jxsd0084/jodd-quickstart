package com.quickstart;

import com.quickstart.actions.IndexAction;
import jodd.madvoc.component.MadvocConfig;
import jodd.madvoc.component.MadvocListener;
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
public class AppMadvocConfig implements MadvocListener.Init {

	@PetiteInject
	MadvocConfig madvocConfig;

	@Override
	public void init() {
		madvocConfig.setFileUploadFactory(new AdaptiveFileUploadFactory());

		madvocConfig.getRootPackages().addRootPackageOf(IndexAction.class);

		CsrfShield.setTimeToLive(0);
	}
}
