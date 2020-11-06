<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm danh mục</title>
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
						<form:form action="/SpringMVC/admin/chinh-sua-danh-muc/${ editCategory.id }" method="POST"
							modelAttribute="editCategory">

							<h3 class="text-center text-info">Chỉnh sửa danh mục</h3>
							<!-- FirstName -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Tên danh mục</label><br>
								<form:input type="text" class="form-control" path="name" />
							</div>
							
							<!-- Nút đăng ký -->
							<div class="form-group text-center">
								<input type="submit" name="submit" id="submit"
									class="btn btn-info btn-md font-weight-bold" value="Chỉnh sửa">

							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>