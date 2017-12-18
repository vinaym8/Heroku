<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Order </title>
</head>
<body>

	<h2 align="center" > Orders </h2>
	
	<table>
	
		<form action="allOrders">
		
			<tr><td>OrderNumber   : </td><td><input type="text" name="orderNumber"/>
			<tr><td>ProductCode   : </td><td><input type="text" name="productCode"/></td></tr>
			<tr><td><input type="submit" value="Place Order"/></td></tr>
		
		
		</form>
	
	</table>

</body>
</html>