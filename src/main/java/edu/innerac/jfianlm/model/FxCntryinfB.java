package edu.innerac.jfianlm.model;

import com.jfinal.plugin.activerecord.Model;

public class FxCntryinfB extends Model<FxCntryinfB>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final FxCntryinfB dao = new FxCntryinfB();
	
	public String CITYCODE;
	public String CITYNAME;
	public String PARENTNODE;
	public String FLAG;
	
	public void init(){
		CITYCODE = getStr("CITYCODE");
		CITYNAME = getStr("CITYNAME");
		PARENTNODE = getStr("PARENTNODE");
		FLAG = getStr("FLAG");
	}

	@Override
	public String toString() {
		return "FxCntryinfB [CITYCODE=" + CITYCODE + ", CITYNAME=" + CITYNAME + ", PARENTNODE=" + PARENTNODE + ", FLAG="
				+ FLAG + "]";
	}

}
