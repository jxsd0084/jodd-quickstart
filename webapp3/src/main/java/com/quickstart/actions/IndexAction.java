package com.quickstart.actions;

import com.quickstart.service.BookService;
import jodd.joy.madvoc.action.AppAction;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.InterceptedBy;
import jodd.madvoc.meta.MadvocAction;
import jodd.petite.meta.PetiteInject;

/**
 * Index action.
 */
@MadvocAction("index")
public class IndexAction extends AppAction {

	@PetiteInject
	BookService bookService;

	/**
	 * Mapped to /index.html page. Does nothing.
	 */
	@Action
	@InterceptedBy(AppInterceptorStack.class)
	public void view() {
		System.out.println("IndexAction.view " + bookService);
	}

}