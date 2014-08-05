package com.quickstart.actions;

import com.quickstart.model.Book;
import com.quickstart.service.BookService;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.Out;
import jodd.petite.meta.PetiteInject;

/**
 * Book action handles books requests.
 */
public class BookAction {

	/**
	 * Inject service bean, so we can fetch the books.
	 */
	@PetiteInject
	BookService bookService;

	/**
	 * The book instance will be available as request attribute.
	 */
	@Out Book book;

	/**
	 * Receives the book ID and fetch the book.
	 */
	public void get(@In int id) {
		book = bookService.findBook(id);
	}
}