<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
li{
  list-style-type:lower-alpha;
}
#a1{
	width:100px;
	height:100px;
	background:red;
	position:relative;
	animation:myfirst 30s;
	-webkit-animation:myfirst 30s; /* Safari and Chrome */
}


#a2{
	width:100px;
	height:100px;
	background:red;
	position:relative;
	animation:myfirst 20s;
	-webkit-animation:myfirst 20s; /* Safari and Chrome */
}


#a3{
	width:100px;
	height:100px;
	background:red;
	position:relative;
	animation:myfirst 15s;
	-webkit-animation:myfirst 15s; /* Safari and Chrome */
}

@keyframes myfirst
{
	0%   {background:red; left:0px; top:0px;}
	25%  {background:yellow; left:1400px; top:0px;}
	50%  {background:black; left:500px; top:500px;}
	75%  {background:green; left:0px; top:400px;}
	100% {background:red; left:0px; top:0px;}
}

@-webkit-keyframes myfirst /* Safari and Chrome */
{
	0%   {background:red; left:0px; top:0px;}
	25%  {background:pink; left:200px; top:0px;}
	50%  {background:blue; left:200px; top:200px;}
	75%  {background:green; left:300px; top:800px;}
	100% {background:red; left:200px; top:0px;}
}
</style>
<script src="js/jquery_dev.js"></script>
</head>
<body>
<h1 style="color:black;">你好啊</h1>
<ul>
<c:forEach items="${bxjg}" var="jg">
  <li style="color:red;">${jg}</li>
  </c:forEach>
</ul>
<div id="a1"><p1>小可爱</p1></div>
<div id="a2"><p1>小可爱</p1></div>
<div id="a3"><p1>小可爱</p1></div>
<div id="show"></div>
<script >

</script>
</body>
</html>