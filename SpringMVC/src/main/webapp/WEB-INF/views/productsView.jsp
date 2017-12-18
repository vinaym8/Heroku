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
	<h2 align="center"> Products </h2>
		
		<div align="center">
		<table border="2">
		
			<tr>
				<th>ProductCode</th><th>ProductName</th><th>ProductLine</th><th>ProductScale</th>
				<th>ProductVendor</th><th>productDescription</th>	<th>QuantityInStock</th><th>BuyPrice</th><th>MSRP</th>			
			</tr>
			
			<c:forEach items="${products}" var="products">
				<tr>
					<td>${products.productCode}</td>
					<td>${products.productName}</td>
					<td>${products.productLine}</td>
					<td>${products.productScale}</td>
					<td>${products.productVendor}</td>
					<td>${products.productDescription}</td>
					<td>${products.quantityInStock}</td>
					<td>${products.buyPrice}</td>
					<td>${products.MSRP}</td>
				</tr>
			</c:forEach>
			
		</table>
		</div>


</body>
</html>