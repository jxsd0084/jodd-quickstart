package org.jodd.quickstart.madvoc.service;

import org.jodd.quickstart.madvoc.model.Survey;

/**
 * Dummy, mockup storage.
 */
public class SurveyStorage {

	// this is storage for Survey
	private static Survey SURVEY;

	public static void store(Survey survey) {
		SURVEY = survey;
	}

	public static Survey load() {
		return SURVEY;
	}

}