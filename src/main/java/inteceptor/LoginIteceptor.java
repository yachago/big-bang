package inteceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginIteceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		String result=null;
	    Map map=invocation.getInvocationContext().getSession();
	   Object user= map.get("user");
	   if(user!=null){
		    result=invocation.invoke();
		    System.out.println("以登陆");
	   }
	   else{
		    result="login";
		    System.out.println("未登陆");
	   }
		return result;
	}

}
