
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
    输入姓名<input type="text" name="name">
    输入密码<input type="password" name="password">
    <input type="submit">
    </form>
    
    <%
    String name="xiaocheche";
    request.setAttribute("name", name);
    session.setAttribute("date", new Date());
    Object []list={"擎天柱","霸天虎","威震天","大黄蜂"};
    
    request.setAttribute("list",list);
    %>
    <h1>我是<s:property value="#request.name"/></h1>
    <h1> 现在时间是<s:date name="#session.date" format="yyyy-MM-yy HH:mm:ss"/></h1>  
    <s:iterator value="#request.list" var="jg" status="a">
    ${a.count }<h1>${jg }${a.count }</h1>
    
    </s:iterator>
</body>
</html>