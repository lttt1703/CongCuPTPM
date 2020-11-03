<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="register">
		<div class="container">
			<!-- Canh lề -->
			<div id="register-row"
				class="row justify-content-center align-item-center">
				<div id="register-column" class="col-md-6">
					<!-- Khung đăng nhập -->
					<div id="register-box" class="col-md-12">
						<form:form action="/SpringMVC/admin/chinh-sua-san-pham/${ editProduct.id }" method="POST"
							modelAttribute="editProduct">

							<h3 class="text-center text-info">Chỉnh sửa thông tin sản phẩm</h3>
							<!-- FirstName -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Tên
									sản phẩm</label><br>
								<form:input type="text" class="form-control" path="name" />
							</div>
							<!-- LastName -->
							<div class="form-group">
								<div class="row">
									<div class="col-lg-6">
										<label for="username" class="text-info font-weight-bold">Danh
											mục </label><br>
										<form:select path="category_id">
											<c:forEach var="item" items="${ categories }">
												<form:option value="${ item.id }">${ item.name }</form:option>
											</c:forEach>
										</form:select>
									</div>
									<div class="col-lg-6">
										<label for="username" class="text-info font-weight-bold">Nhà
											sản xuất</label><br>
										<form:select path="producer_id">
											<c:forEach var="item" items="${ nsx }">
												<form:option value="${ item.id }">${ item.name }</form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>

							</div>
							<!-- Tên đăng nhập -->
							<!-- Mật khẩu -->
							<div class="form-group">
								<label for="password" class="text-info font-weight-bold">Giá</label><br>
								<form:input type="text" class="form-control" path="price" />
							</div>
							<div class="form-group">
								<label for="password" class="text-info font-weight-bold">Mô
									tả</label><br>
								<form:input type="text" class="form-control" path="detail" />
							</div>
							<div class="form-group">
								<label for="password" class="text-info font-weight-bold">Ảnh</label><br>
								<form:input type="text" class="form-control" path="image" />
							</div>
							<div class="form-group">
								<label for="password" class="text-info font-weight-bold">Khuyến
									mãi</label><br>
								<form:input type="text" class="form-control" path="sale" />
							</div>
							<!-- Nút đăng ký -->
							<div class="form-group text-center">
								<input type="submit" name="submit" id="submit"
									class="btn btn-info btn-md font-weight-bold" value="Chính sửa">

							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>