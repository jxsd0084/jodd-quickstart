package org.jodd.quickstart.madvoc.flow;

import jodd.madvoc.interceptor.DefaultWebAppInterceptors;
import jodd.madvoc.interceptor.Preparable;
import jodd.madvoc.interceptor.PreparableInterceptor;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.InOut;
import jodd.madvoc.meta.InterceptedBy;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.result.Result;
import org.jodd.quickstart.madvoc.model.Survey;
import org.jodd.quickstart.madvoc.service.SurveyStorage;

@MadvocAction
@InterceptedBy({PreparableInterceptor.class, DefaultWebAppInterceptors.class})
public class StepThreeAction implements Preparable {

	Result result = new Result();

	@InOut
	Survey survey;

	@Override
	public void prepare() {
		survey = SurveyStorage.load();
	}

	@Action
	public void view() {
	}

	@In
	boolean back;

	@Action(extension = Action.NONE)
	public void save() {
		SurveyStorage.store(survey);
		if (back) {
			System.out.println("Back to the second page!");
			result.redirectTo(StepTwoAction.class).view();
			return;
		}
		result.redirectTo(this).end();
	}

	@Action
	public void end() {
	}

}