package org.jodd.quickstart.madvocpetite;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;

/**
 * About action.
 */
@MadvocAction
public class AboutAction {

	/**
	 * Input and output action parameter.
	 * Can be marked with @InOut annotation.
	 */
	@In
	@Out
	String version;

	/**
	 * Action mapped to: /about.jodd.html
	 */
	@Action
	public void jodd() {
		System.out.println("AboutAction.jodd " + version);
	}
}
