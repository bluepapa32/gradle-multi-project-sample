<%@ page language="java" 
         contentType="text/html; charset=UTF-8" %>
         
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Store</title>
</head>
<body>

<ol>
<c:forEach var="book" items="${books}"> 
  <li><c:out value="${book.title}" /></li>
</c:forEach>
</ol>

</body>
</html>
