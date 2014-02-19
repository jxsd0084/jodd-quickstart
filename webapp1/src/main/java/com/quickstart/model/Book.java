package com.quickstart.model;

import jodd.db.oom.meta.DbColumn;
import jodd.db.oom.meta.DbTable;

/**
 * Book model object.
 */
@DbTable
public class Book {

	@DbColumn
	private long id;

	@DbColumn
	private String name;

	@DbColumn
	private String author;

	// ---------------------------------------------------------------- access

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
