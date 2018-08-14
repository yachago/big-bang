package test.struts;

import com.opensymphony.xwork2.ActionSupport;
import enitity.*;
public class User extends ActionSupport  {
	
	String username;
	String userpassword;
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
       String login()throws Exception{
		System.out.println("login----->");
		String result=null;
		if(username.equals("xiaoche") && userpassword.equals("123")){
			result="success";
		}
		else{
			result="login";
		}
		return result;
	}

}
