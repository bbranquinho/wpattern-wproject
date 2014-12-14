package org.wproject.desktop.application;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.wproject.desktop.application.interfaces.IApplication;
import org.wproject.desktop.application.interfaces.ICategoryWindow;

@Named
public class Application implements IApplication {

	private Logger logger = Logger.getLogger(getClass());

	@Inject
	private ICategoryWindow categoryWindow;

	@Override
	public void startApplication() {
		if (logger.isDebugEnabled()) {
			logger.debug("Application started.");
		}

		categoryWindow.showWindow();
	}

}
