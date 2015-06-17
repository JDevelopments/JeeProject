
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		List style = (List) request.getAttribute("style");
	    Iterator iterator = style.iterator();
	    while(iterator.hasNext()){
	    	out.print("<br>" + iterator.next() + "<hr>");
	    }
	%>
</body>
</html>