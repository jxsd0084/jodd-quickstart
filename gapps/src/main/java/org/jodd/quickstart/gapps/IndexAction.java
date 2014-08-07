package org.jodd.quickstart.gapps;

import jodd.madvoc.ScopeType;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.InOut;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import jodd.mutable.MutableInteger;

/**
 * Simple pill-clicking application.
 */
@MadvocAction
public class IndexAction {

	// session storage
	@InOut(scope = ScopeType.SESSION)
	MutableInteger blue;

	// session storage
	@InOut(scope = ScopeType.SESSION)
	MutableInteger red;

	// request attributes for printing
	@Out int b;
	@Out int r;

	@Action
	public void view() {
		if (blue == null) {
			blue = new MutableInteger(0);
		}
		if (red == null) {
			red = new MutableInteger(0);
		}
		b = blue.value;
		r = red.value;
	}

	@In
	String color;

	@Action(extension = Action.NONE)
	public String click() {

		// just to initialize to prevent NPE
		view();

		if (color.equals("blue")) {
			blue.value++;
		}
		if (color.equals("red")) {
			red.value++;
		}

		// updated values
		b = blue.value;
		r = red.value;

		return "redirect:/index.html";
	}

}