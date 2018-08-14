package test.struts;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class Login implements Action {

	String name;
	String password;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map map=ActionContext.getContext().getSession();
		map.put("che", "欢迎来到英雄联盟");
		if("xiaoche".equals(name) &&"123".equals(password)){
			return "success";
		}
		else{
		return "error";
		}
	}

}
