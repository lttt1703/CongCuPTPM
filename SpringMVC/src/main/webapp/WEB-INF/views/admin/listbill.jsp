<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách đơn hàng</title>
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
								<th>ID</th>
								<th>User</th>
								<th>Address</th>
								<th>Phone</th>
								<th>Total</th>
								<th>Quanty</th>
								<th>Note</th>
								<th>Detail</th>
							</tr>
						</thead>
						<c:forEach var="item" items="${ bills }">
							<tbody>
								<tr>
									<td>${ item.id }</td>
									<td>${ item.user }</td>
									<td>${ item.address }</td> 
									<td>${ item.phone }</td> 
									<td>${ item.total }</td> 
									<td>${ item.quanty }</td> 
									<td>${ item.note }</td> 
									<td><button type="button"
											class="btn btn-info btn-mini edit-cart">View</button></td>
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