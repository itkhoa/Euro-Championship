<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home page</title>
<!-- plugin -->
<link rel="stylesheet" href="<s:url value="/assets/plugin/bootstrap/css/bootstrap.min.css" />"/>
<script src="${pageContext.request.contextPath}/assets/plugin/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugin/bootstrap/js/bootstrap.min.js"></script>
<!-- layout -->
<link rel="stylesheet" type="text/css" href="<s:url value="/assets/css/main.css"/>"/>
<link rel="stylesheet" type="text/css" href="<s:url value="/assets/css/menu.css"/>"/>
<!-- icon -->
<link rel="icon" href="${pageContext.request.contextPath}/assets/favicon.ico">
</head>
<body>
	<!-- BEGIN HEADER -->
	<div class="page-header">
		<div style="text-align: center">
			<h1>EURO CHAMPIONSHIP</h1>
		</div>
	</div>
	<!-- END HEADER -->
	
	<!-- BEGIN CONTENT -->
	<div class="page-content">
		<div class="row">
			<div class="col-md-4">
				<div style="text-align: center;">
					<h3>MENU</h3>
					<ul style="list-style: none;">
						<li><a href="management">Teams Management</a></li>
						<li><a href="group">Information Group</a></li>
						<li><a href="">Information Charts</a></li>
						<li><a href="">Who's Champion</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-8">
				<div class="content">
					<h2>WELCOME TO EURO FOOTBALL CHAMPION</h2>
				</div>
			</div>
		</div>
	</div>
	<!-- END CONTENT -->
	
	<!-- BEGIN FOOTER -->
	<div class="page-footer">
		<div class="copyright" style="text-align: center;">
			<h3>Base on Struts 2 Framework</h3>
		</div>
	</div>
	<!-- END FOOTER -->
</body>
</html>