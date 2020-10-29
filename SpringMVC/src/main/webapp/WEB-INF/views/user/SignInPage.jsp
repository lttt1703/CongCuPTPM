<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head lang="vi">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<link rel="stylesheet" href="./assets/css/bootstrap.css">
<link rel="stylesheet" href="./assets/css/loginPage.css">
<title>Đăng Nhập</title>
</head>

<body>
	</div>
	<div id="login">
		<div class="container">
			<!-- Canh lề -->
			<div id="login-row"
				class="row justify-content-center align-item-center">
				<div id="login-column" class="col-md-6">
					<!-- Khung đăng nhập -->
					<div id="login-box" class="col-md-12">
						<form:form action="dang-nhap" method="POST" modelAttribute="user">

							<h3 class="text-center text-info">Đăng nhập</h3>
								<p style="color: red;">${ statusLogin }</p>
							<!-- Tên đăng nhập -->
							<div class="form-group">
								<label for="username" class="text-info font-weight-bold">Tên
									đăng nhập:</label> <br>
								<form:input type="text" class="form-control"
									placeholder="Tên đăng nhập" path="user" />
							</div>
							<!-- Mật khẩu -->
							<div class="form-group">
								<label for="password" class="text-info font-weight-bold">Mật
									khẩu:</label><br>
								<form:input type="password" class="form-control"
									placeholder="Mật khẩu" path="password" />
							</div>
							<!-- Lưu mật khẩu và nút đăng nhập -->
							<div class="form-group">
								<label for="rememberme" class="text-info font-weight-bold"><span>Nhớ
										mật khẩu</span> <span><input type="checkbox" name="rememberme"
										id="rememberme"></span></label><br>
								<div class="text-center">
									<input type="submit" name="submit" id="submit"
										class="btn btn-info btn-md font-weight-bold" value="Đăng nhập">
								</div>
							</div>
							<!-- link đăng ký -->
							<div id="register-link" class="text-right">
								<a href="/SpringMVC/dang-ky" class="text-info font-weight-bold">Đăng
									ký tại đây</a>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>