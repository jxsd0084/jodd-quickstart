package com.quickstart;

import jodd.joy.JoyContextListener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener extends JoyContextListener {

	@Override
	protected void configureServletContext(ServletContext servletContext) {
		super.enableDecora();
		super.configureServletContext(servletContext);
	}
}
