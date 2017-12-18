<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center"> Order Details </h2>
		
		<div align="center">
		<table border="2">
		
			<tr>
				<th>OrderNumber</th><th>ProductCode</th><th>QuantityOrdered</th><th>PriceEach</th><th>OrderLineNumber</th>				
			</tr>
			
			<c:forEach items="${orderdetails}" var="orderdetails">
				<tr>
					<td>${orderdetails.key.number}</td>
					<td>${orderdetails.key.productcode}</td>
					<td>${orderdetails.quantityordered}</td>
					<td>${orderdetails.priceeach}</td>
					<td>${orderdetails.orderlinenumber}</td>
				</tr>
			</c:forEach>
			
		</table>
		</div>


</body>
</html>