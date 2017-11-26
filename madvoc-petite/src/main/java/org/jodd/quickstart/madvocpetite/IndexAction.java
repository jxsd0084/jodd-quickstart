package org.jodd.quickstart.madvocpetite;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import jodd.petite.meta.PetiteInject;

/**
 * Index action.
 */
@MadvocAction
public class IndexAction {

	/**
	 * Defines output attribute.
	 * It will be available as request attribute.
	 */
	@Out
	String version;

	@PetiteInject
	MyBean myBean;

	/**
	 * Action mapped to /index.html.
	 * todo add index page logic here
	 */
	@Action
	public void view() {
		System.out.println("IndexAction.view " + (myBean != null));
		version = "3.6.x";
	}
}
