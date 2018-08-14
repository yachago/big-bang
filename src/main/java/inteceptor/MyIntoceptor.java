package inteceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyIntoceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		String result=null;
		long begin=System.currentTimeMillis();
		System.out.println("开始时间"+begin);
		long end=System.currentTimeMillis();
		System.out.println("结束"+(end-begin));
		
		if(5>2){
		    result=invocation.invoke();
			System.out.println("1122");
		}
		else{
			result= "false";
		}
		return result;
	}

}
