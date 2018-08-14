
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="regist" method="post">
    输入姓名<input type="text" name="user.userName"><br/>
    输入密码<input type="password" name="user.userPwd"><br/>
    输入密码<input type="text" name="user.userPwd"><br/>
    性别<input type="radio" name="sex" value="true">男
        女<input type="radio" name="sex" value="false">
  生日<input type="text" name="user.birthday"><br/>
  <input type="text" name="user.hoby">
  <input type="text" name="user.hoby">
  <input type="text" name="user.hoby">
    <input type="submit">
    </form>
</body>
</html>