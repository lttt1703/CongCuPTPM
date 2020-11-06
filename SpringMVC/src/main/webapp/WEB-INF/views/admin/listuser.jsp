<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách người dùng</title>
</head>
<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<!-- DataTales Example -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">Danh sách tài
					khoản</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						<thead>
							<tr>
								<th>Name</th>
								<th>User_Name</th>
								<th>Email</th>
								<th>Address</th>
								<th>Phone</th>
							</tr>
						</thead>
						<c:forEach var="item" items="${ listUser }">
							<tbody>
								<tr>
									<td>${ item.name }</td>
									<td>${ item.user }</td>
									<td>${ item.email }</td> 
									<td></td> 
									<td></td> 
								</tr> 
							</tbody>
						</c:forEach>

					</table>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container-fluid -->
</body>
</html>