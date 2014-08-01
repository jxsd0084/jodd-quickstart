package org.jodd.quickstart.madvoc.flow;

import jodd.madvoc.interceptor.DefaultWebAppInterceptors;
import jodd.madvoc.interceptor.Preparable;
import jodd.madvoc.interceptor.PreparableInterceptor;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.InOut;
import jodd.madvoc.meta.InterceptedBy;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.result.Result;
import org.jodd.quickstart.madvoc.model.Survey;
import org.jodd.quickstart.madvoc.service.SurveyStorage;

@MadvocAction
@InterceptedBy({PreparableInterceptor.class, DefaultWebAppInterceptors.class})
public class IndexAction implements Preparable {

	Result result = new Result();

	@InOut
	Survey survey;

	/**
	 * Loads survey from the storage _before_ it gets
	 * populated from the form.
	 */
	@Override
	public void prepare() {
		survey = SurveyStorage.load();
	}

	@Action
	public void view() {
	}

	@Action(extension = Action.NONE)
	public void save() {
		SurveyStorage.store(survey);
		result.redirectTo(StepTwoAction.class).view();
	}

}