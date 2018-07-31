<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%
    String URL = "jdbc:mysql://localhost:3306/online_tshirt";
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String USER = "root";
    String PASS = "3070";
    Connection conn=null;
    try {
    	Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(URL,USER,PASS);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online T-Shirt</title>
</head>
<body>
		<h1>Orders</h1><hr>
		<%
			Statement s = conn.createStatement();
			String sql = "SELECT * FROM `T-Shirt`";
			ResultSet rs = s.executeQuery(sql);
		%>
		<table border="1">
			<thead>
				<th>OrderID</th>
				<th>Color</th>
				<th>chest Pocket</th>
				<th>Tag Line</th>
				<th>Accessories</th>
			</thead>
			<tbody>
				<% while(rs.next()){%>
				<tr>
					<td><%=rs.getInt("orderID") %></td>
					<td><%=rs.getString("color") %></td>
					<td><%if(rs.getInt("chest_pocket") == 0)
								out.print("No");
						else
								out.print("Yes"); %></td>
					<td><%=rs.getString("tag_line") %></td>
					<td><%=rs.getString("accessories") %></td>
				</tr>
					<%} %>
			</tbody>
		</table>
</body>
</html>