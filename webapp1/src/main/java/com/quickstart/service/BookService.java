package com.quickstart.service;

import com.quickstart.model.Book;
import jodd.joy.db.AppDao;
import jodd.petite.meta.PetiteBean;
import jodd.petite.meta.PetiteInject;

import java.util.List;

/**
 * User services.
 */
@PetiteBean
public class BookService {

	@PetiteInject
	AppDao appDao;

	/**
	 * Finds all books.
	 */
	public List<Book> findAllUsers() {
		System.out.println("BookService findAllUsers " + appDao.toString());

		return appDao.listAll(Book.class);
	}

}
