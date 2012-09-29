package com.quickstart.service;

import com.quickstart.model.User;
import jodd.joy.db.AppDao;
import jodd.petite.meta.PetiteBean;
import jodd.petite.meta.PetiteInject;

import java.util.List;

/**
 * User services.
 */
@PetiteBean
public class UserService {

	@PetiteInject
	AppDao appDao;

	public List<User> findAllUsers() {
		return appDao.list(User.class);
	}

}
