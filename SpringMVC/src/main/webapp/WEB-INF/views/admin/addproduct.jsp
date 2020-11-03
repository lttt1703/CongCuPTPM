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
						<form:form action="/SpringMVC/admin/them-san-pham" method="POST"
							modelAttribute="newProduct">

							<h3 class="text-center text-info">Thêm sản phẩm</h3>
							<!-- FirstName -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Tên
									sản phẩm</label><br>
								<form:input type="text" class="form-control"
									placeholder="Họ và tên" path="name" />
							</div>
							<!-- LastName -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Danh
									mục</label><br>
								<form:input type="text" class="form-control"
									placeholder="Danh mục" path="category_id" />
							</div> 
							<!-- Tên đăng nhập -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Nhà
									sản xuất</label><br>
								<form:input type="text" class="form-control"
									placeholder="User name" path="producer_id" />
							</div>
							<!-- Mật khẩu -->
							<div class="form-group">
								<label for="password" class="text-info font-weight-bold">Giá</label><br>
								<form:input type="password" class="form-control"
									placeholder="Password" path="price" />
							</div>
							<!-- Nút đăng ký -->
							<div class="form-group text-center">
								<input type="submit" name="submit" id="submit"
									class="btn btn-info btn-md font-weight-bold" value="Thêm">

							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>