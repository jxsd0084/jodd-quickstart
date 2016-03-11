package org.jodd.quickstart.madvoc;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;

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

	/**
	 * Action mapped to /index.html.
	 * todo add index page logic here
	 */
	@Action
	public void view() {
		System.out.println("IndexAction.view");
		version = "3.6.x";
	}
}
