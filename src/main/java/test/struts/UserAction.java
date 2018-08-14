package test.struts;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import enitity.User;

public class UserAction extends ActionSupport {
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String login(){
		String result=null;
		System.out.println("ok"+user.getUserName());
		if(user.getUserName().equals("xiaoche") && user.getUserPwd().equals("123")){
			result="success";
			user.setUserName(user.getUserName());
			user.setUserPwd(user.getUserPwd());
			Map session=ActionContext.getContext().getSession();
			session.put("user", user);
		}
		else{
			result="login";
		}
		return result;
	}

	public String github(){
		return "success";
	}
}
