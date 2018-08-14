package test.struts;

import org.apache.struts2.json.annotations.JSON;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class JsonAction extends ActionSupport{
	
	String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "JsonAction [result=" + result + "]";
	}
	
    public String getJson() throws Exception{
    	Object []json={"擎天柱","霸天虎","大黄蜂","威震天"};
    	Gson gson=new Gson();
    	result=gson.toJson(json);
    	return "success";
    }
}
