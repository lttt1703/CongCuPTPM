<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">


<!-- Custom fonts for this template-->
<link
	href="<c:url value = "/assets/vendor/fontawesome-free/css/all.min.css" />"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="<c:url value = "/assets/css/sb-admin-2.min.css" />"
	rel="stylesheet">

</head>

<body id="page-top">

	<!-- Header -->
	<c:if test="${ empty adminInfo }">
		<%@include file="/WEB-INF/views/admin/login.jsp"%>
	</c:if>
	<c:if test="${ not empty adminInfo }">
		<%@include file="/WEB-INF/views/layouts/admin/header.jsp"%>
	</c:if>


	<!-- Footer -->


	<!-- Bootstrap core JavaScript-->
	<script src="<c:url value = "/assets/vendor/jquery/jquery.min.js" />"></script>
	<script
		src="<c:url value = "/assets/vendor/bootstrap/js/bootstrap.bundle.min.js" />"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="<c:url value = "/assets/vendor/jquery-easing/jquery.easing.min.js" />"></script>

	<!-- Custom scripts for all pages-->
	<script src="<c:url value = "/assets/js/sb-admin-2.min.js" />"></script>

	<!-- Page level plugins -->
	<script src="<c:url value = "/assets/vendor/chart.js/Chart.min.js" />"></script>

	<!-- Page level custom scripts -->
	<script src="<c:url value = "/assets/js/demo/chart-area-demo.js" />"></script>
	<script src="<c:url value = "/assets/js/demo/chart-pie-demo.js" />"></script>

</body>

</html>
