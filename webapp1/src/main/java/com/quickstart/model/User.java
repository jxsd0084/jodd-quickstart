package com.quickstart.model;

import jodd.db.oom.meta.DbColumn;
import jodd.db.oom.meta.DbTable;
import jodd.joy.db.Entity;

/**
 * User model object.
 */
@DbTable
public class User extends Entity {

	@DbColumn
	private long id;

	@DbColumn
	private String name;

	@DbColumn
	private String email;

	@Override
	protected long getEntityId() {
		return id;
	}

	@Override
	protected void setEntityId(long id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
