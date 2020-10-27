<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="description" content="Ogani Template">
<meta name="keywords" content="Ogani, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title><decorator:title default="Master-layout" /></title>

<link rel="stylesheet"
	href="<c:url value = "/assets/css/bootstrap.min.css" />"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value = "/assets/css/font-awesome.min.css" />"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value = "/assets/css/elegant-icons.css" />"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value = "/assets/css/nice-select.css" />" type="text/css">
<link rel="stylesheet"
	href="<c:url value = "/assets/css/jquery-ui.min.css" />"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value = "/assets/css/owl.carousel.min.css" />"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value = "/assets/css/slicknav.min.css" />" type="text/css">
<link rel="stylesheet" href="<c:url value = "/assets/css/style.css" />"
	type="text/css">

<link
	href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap"
	rel="stylesheet">

</head>

<body>

	<!-- Header -->

	<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>

	<decorator:body></decorator:body>


	<!-- Footer -->

	<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>

	<!-- Js Plugins -->
	<script src="<c:url value = "/assets/js/jquery-3.3.1.min.js" />"></script>
	<script src="<c:url value = "/assets/js/bootstrap.min.js" />"></script>
	<script src="<c:url value = "assets/js/jquery.nice-select.min.js" />"></script>
	<script src="<c:url value = "/assets/js/jquery-ui.min.js" />"></script>
	<script src="<c:url value = "/assets/js/jquery.slicknav.js" />"></script>
	<script src="<c:url value = "/assets/js/mixitup.min.js" />"></script>
	<script src="<c:url value = "/assets/js/owl.carousel.min.js" />"></script>
	<script src="<c:url value = "/assets/js/main.js" />"></script>
	
	<decorator:getProperty property="page.script"></decorator:getProperty>
</body>
</html>
