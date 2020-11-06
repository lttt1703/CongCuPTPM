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
				<h6 class="m-0 font-weight-bold text-primary">Danh sách sản
					phẩm</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						<thead>
							<tr>
								<th>ID</th>
								<th>Name</th>
								<th>Edit</th>
								<th>Delete</th>
							</tr>
						</thead>
						<c:forEach var="item" items="${ categories }">
							<form:form action="/SpringMVC/admin/xoa-danh-muc/${ item.id }"
								method="POST">
								<tbody>
									<tr>
										<td>${ item.id }</td>
										<td>${ item.name }</td>
										<td><a
											href="/SpringMVC/admin/chinh-sua-danh-muc/${ item.id }"
											class="btn btn-info btn-md font-weight-bold">Edit</a></td>
										<td><input type="submit" name="submit" id="submit"
											class="btn btn-info btn-md font-weight-bold" value="Delete"></td>
									</tr>
								</tbody>
							</form:form>
						</c:forEach>

					</table>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container-fluid -->
</body>
</html>