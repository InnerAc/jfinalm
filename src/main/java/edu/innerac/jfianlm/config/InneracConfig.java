package edu.innerac.jfianlm.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

import edu.innerac.jfianlm.controller.InneracController;
import edu.innerac.jfianlm.model.FxCntryinfB;

public class InneracConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants arg0) {
		arg0.setDevMode(false);
		String webRoot = PathKit.getWebRootPath();
		System.out.println(webRoot);
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
		C3p0Plugin cp = new C3p0Plugin("jdbc:mysql://127.0.0.1/swjsysq","innerac", "anjicun");
		arg0.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
		arp.addMapping("fx_cntryinf_b", "CITYCODE",FxCntryinfB.class);
		arg0.add(arp);
	}

	@Override
	public void configRoute(Routes arg0) {
		arg0.add("/hello", InneracController.class);
	}

}
