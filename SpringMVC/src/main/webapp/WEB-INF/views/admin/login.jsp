<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<title>SB Admin 2 - Login</title>

</head>

<body class="bg-gradient-primary">

	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
							<div class="col-lg-6">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
									</div>
									<p style="color: red;">${ statusLogin }</p>
									<form:form action="/SpringMVC/admin/dang-nhap" method="POST"
										modelAttribute="admin">
										<div class="form-group">
											<form:input type="text"
												class="form-control form-control-user"
												id="exampleInputEmail" aria-describedby="emailHelp"
												placeholder="Tên đăng nhập" path="user" />
										</div>
										<div class="form-group">
											<form:input type="password"
												class="form-control form-control-user"
												id="exampleInputPassword" placeholder="Mật khẩu"
												path="password" />
										</div>
										<div class="form-group">
											<div class="custom-control custom-checkbox small">
												<input type="checkbox" class="custom-control-input"
													id="customCheck"> <label
													class="custom-control-label" for="customCheck">Remember
													Me</label>
											</div>
										</div>
										<input type="submit" name="submit" id="submit"
											class="btn btn-primary btn-user btn-block" value="Đăng nhập">
										<hr>
										<a href="#" class="btn btn-google btn-user btn-block"> <i
											class="fab fa-google fa-fw"></i> Login with Google
										</a>
										<a href="#" class="btn btn-facebook btn-user btn-block"> <i
											class="fab fa-facebook-f fa-fw"></i> Login with Facebook
										</a>
									</form:form>

									<hr>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>

		</div>

	</div>


</body>

</html>
