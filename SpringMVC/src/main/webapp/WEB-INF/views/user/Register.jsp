<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head lang="vi">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<link rel="stylesheet" href="./assets/css/bootstrap.css">
<link rel="stylesheet" href="./assets/css/registerPage.css">
<title>Đăng ký</title>
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
						<form:form action="dang-ky" method="POST" modelAttribute="user">

							<h3 class="text-center text-info">Đăng Ký</h3>
							<!-- FirstName -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Họ
									Tên:</label><br>
								<form:input type="text" class="form-control"
									placeholder="Họ và tên" path="name" />
							</div>
							<!-- LastName -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Email:</label><br>
								<form:input type="text" class="form-control" placeholder="Email"
									path="email" />
							</div>
							<!-- Tên đăng nhập -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Tên
									đăng nhập:</label><br>
								<form:input type="text" class="form-control"
									placeholder="User name" path="user" />
							</div>
							<!-- Mật khẩu -->
							<div class="form-group">
								<label for="password" class="text-info font-weight-bold">Mật
									khẩu:</label><br>
								<form:input type="password" class="form-control"
									placeholder="Password" path="password" />
							</div>
							<!-- Nút đăng ký -->
							<div class="form-group text-center">
								<input type="submit" name="submit" id="submit"
									class="btn btn-info btn-md font-weight-bold" value="Đăng ký">
								<input type="button" onclick="window.location='/SpringMVC/dang-nhap';"
									class="btn btn-info btn-md font-weight-bold" value="Đăng nhập">
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>