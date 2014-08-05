package com.quickstart.actions;

import jodd.joy.madvoc.action.AppAction;

/**
 * Index action.
 */
public class IndexAction extends AppAction {

	/**
	 * Mapped to /index.html page. Does nothing.
	 */
	public void view() {
		System.out.println("IndexAction.view");
	}

}