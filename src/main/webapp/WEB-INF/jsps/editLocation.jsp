<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sEdit Location</title>
</head>
<body>
<form action="uploadLoc" method="post">
		<pre>
		Id:<input type="text" name="id" value="${location.id }" readonly />
		 Code: <input type="text"
				name="code" value="${location.code}" /> Name:<input type="text" name="name" value="${location.name }" /> Type : Urban<input
				type="radio" name="type"  value="URBAN" ${location.type=='URBAN'?'URBAN':'' }/> Rural<input type="radio" name="type" value="RURAL"
				 ${location.type=='RURAL'?'RURAL':''} />
			
	 	<input type="submit" value="save" />

</pre>
	</form>

</body>
</html>