package test.struts;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class Hello implements Action {

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map map=(Map) ActionContext.getContext().get("request");
		Object []bxjg={"威震天","擎天柱","大黄蜂","霸天虎","碎骨魔"};
		map.put("bxjg", bxjg);
		return "success";
	}

}
