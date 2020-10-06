<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <div id="login-row" class="row justify-content-center align-item-center">
                <div id="login-column" class="col-md-6">
                    <!-- Khung đăng nhập -->
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="" method="post">
                            <h3 class="text-center text-info">Đăng nhập</h3>
                            <!-- Tên đăng nhập -->
                            <div class="form-group">
                                <label for="username" class="text-info font-weight-bold">Tên đăng nhập:</label><br>
                                <input type="text" name="username" id="username" class="form-control">
                            </div>
                            <!-- Mật khẩu -->
                            <div class="form-group">
                                <label for="password" class="text-info font-weight-bold">Mật khẩu:</label><br>
                                <input type="password" name="password" id="password" class="form-control">
                            </div>
                            <!-- Lưu mật khẩu và nút đăng nhập -->
                            <div class="form-group">
                                <label for="rememberme" class="text-info font-weight-bold"><span>Nhớ mật khẩu</span>
                                    <span><input type="checkbox" name="rememberme" id="rememberme"></span></label><br>
                                <div class="text-center">
                                    <input type="submit" name="submit" id="submit"
                                        class="btn btn-info btn-md font-weight-bold" value="Đăng nhập">
                                </div>
                            </div>
                            <!-- link đăng ký -->
                            <div id="register-link" class="text-right">
                                <a href="Register.html" class="text-info font-weight-bold">Đăng ký tại đây</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>