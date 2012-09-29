package com.quickstart.service;

import jodd.petite.meta.PetiteBean;

/**
 * Single service.
 */
@PetiteBean
public class FooService {

	public String getFrameworkName() {
		return "Jodd";
	}

}
