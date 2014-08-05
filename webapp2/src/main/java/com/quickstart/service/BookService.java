package com.quickstart.service;

import com.quickstart.model.Book;
import jodd.petite.meta.PetiteBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy book services with only few hardcoded books.
 */
@PetiteBean
public class BookService {

	List<Book> books;

	public BookService() {
		books = new ArrayList<>();

		Book book = new Book();
		book.setAuthor("Dave Eggers");
		book.setName("The Circle");
		books.add(book);

		book = new Book();
		book.setAuthor("Tom Rachman");
		book.setName("The Imperfectionists");
		books.add(book);
	}

	/**
	 * Returns a book from the storage.
	 */
	public Book findBook(int bookId) {
		return books.get(bookId - 1);
	}

}
