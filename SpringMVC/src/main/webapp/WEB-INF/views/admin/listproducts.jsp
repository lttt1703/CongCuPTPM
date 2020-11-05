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
								<th>Name</th>
								<th>Detail</th>
								<th>Price</th>
								<th>image</th>
								<th>Edit</th>
								<th>Delete</th>
							</tr>
						</thead>
						<c:forEach var="item" items="${ products }">
							<form:form action="/SpringMVC/admin/xoa-san-pham/${ item.id }"
								method="POST">
								<tbody>
									<tr>
										<td>${ item.name }</td>
										<td>${ item.detail }</td>
										<td>${ item.price }</td>
										<td class="shoping__cart__item"><img width="100"
											height="100" src="${ item.image }" alt="">
										<td><a
											href="/SpringMVC/admin/chinh-sua-san-pham/${ item.id }"
											class="btn btn-info btn-md font-weight-bold">Edit</a></td>
										<td><input type="submit" name="submit" id="submit"
											class="btn btn-info btn-md font-weight-bold"
											value="Delete"></td>
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