package org.wproject.desktop.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wproject.desktop.application.interfaces.IApplication;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext( "/ctx-wproject-desktop-application.xml" );

		IApplication application = context.getBean(IApplication.class);

		application.startApplication();
	}

}
