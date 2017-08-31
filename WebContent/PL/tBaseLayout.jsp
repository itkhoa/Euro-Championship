<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<!-- plugin -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugin/bootstrap/css/bootstrap.min.css"/>
<script src="${pageContext.request.contextPath}/assets/plugin/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugin/bootstrap/js/bootstrap.min.js"></script>
<!-- layout -->

<!-- icon -->
<link rel="icon" href="${pageContext.request.contextPath}/assets/favicon.ico">
</head>
<body>
	
		<div class="page-header">
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="menu">
					<tiles:insertAttribute name="menu"></tiles:insertAttribute>
				</div>
			</div>
			<div class="col-md-8">
				<div class="content">
					<tiles:insertAttribute name="body"></tiles:insertAttribute>
				</div>
			</div>
		</div>
		<div class="page-footer">
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</div>
	
</body>
</html>