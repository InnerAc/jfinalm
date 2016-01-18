package edu.innerac.jfianlm.controller;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

import edu.innerac.jfianlm.model.FxCntryinfB;

public class InneracController extends Controller{

	public void index(){
		String code = "320324113";
		FxCntryinfB fxCntryinfB = FxCntryinfB.dao.findFirst("select * from fx_cntryinf_b where CITYCODE=\""+code+"\"");
		fxCntryinfB.init();
		System.out.println(fxCntryinfB);
		renderText("Hello!!");
	}
	
	@ActionKey("/show")
	public void show(){
		List<FxCntryinfB> fxCntryinfBs = FxCntryinfB.dao.find("select * from fx_cntryinf_b");
		int i = 0;
		List<FxCntryinfB> showFxCntryinfBs = new ArrayList<>();
		for(FxCntryinfB fxCntryinfB : fxCntryinfBs){
			fxCntryinfB.init();
			showFxCntryinfBs.add(fxCntryinfB);
			i++;
			if(i>10){
				break;
			}
		}
		setAttr("infos", showFxCntryinfBs);
		render("/view/show.jsp");
	}
	
	@ActionKey("/test")
	public void test(){
		render("/test.html");
//		renderHtml("ahhh");
	}
}
