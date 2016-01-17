package edu.innerac.jfianlm.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;

import edu.innerac.jfianlm.controller.InneracController;

public class InneracConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants arg0) {
		arg0.setDevMode(true);
		arg0.setViewType(ViewType.JSP);
	}

	@Override
	public void configHandler(Handlers arg0) {

	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configPlugin(Plugins arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configRoute(Routes arg0) {
		arg0.add("/hello", InneracController.class);
	}

}
