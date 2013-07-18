package com.quickstart.actions;

import com.quickstart.model.User;
import com.quickstart.service.FooService;
import com.quickstart.service.UserService;
import jodd.joy.madvoc.action.AppAction;
import jodd.jtx.meta.Transaction;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import jodd.petite.meta.PetiteInject;

import java.util.List;

/**
 * Index action.
 */
@MadvocAction
public class IndexAction extends AppAction {

	/**
	 * Services can be simply injected into actions.
	 */
	@PetiteInject
	FooService fooService;

	@PetiteInject
	UserService userService;

	@Out
	List<User> users;

	/**
	 * Mapped to /index.html page. Calls a service.
	 */
	@Action
	@Transaction
	public void view() {
		System.out.println("IndexAction.view");
		System.out.println(fooService.getFrameworkName());

		users = userService.findAllUsers();
	}
}
