<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<style>
.header__menu {
	display: flex;
	justify-content: center
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	padding: 12px 16px;
	z-index: 1;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
<!--Load trang-->
<div id="preloder">
	<div class="loader"></div>
</div>


<div class="humberger_menu_overlay"></div>
<div class="humberger__menu__wrapper">
	<div class="humberger__menu__logo">
		<a href="#"><img src="<c:url value = "/assets/img/logo.png"/>"
			alt=""></a>
	</div>
	<div class="humberger__menu__cart">
		<ul>
			<li><a href="#"><i class="fa fa-shopping-bag"></i></a></li>
		</ul>
		<div class="header__cart__price">CHAMRME</div>
	</div>
	<div class="humberger__menu__widget">
		<div class="header__top__right__language">
			<span class="arrow_carrot-down"></span>
		</div>
		<div class="header__top__right__auth">
			<a href="/SpringMVC/dang-nhap"><i class="fa fa-user"></i> Login</a>
		</div>
	</div>
	<nav class="humberger__menu__nav mobile-menu">
		<ul>
			<li class="active"><a href="./index.html">Home</a></li>
			<li><a href="/SpringMVC/gio-hang">Giỏ hàng</a></li>
			<li><a href="./contact.html">Liên hệ</a></li>
		</ul>
	</nav>
	<div id="mobile-menu-wrap"></div>
	<div class="header__top__right__social">
		<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
			class="fa fa-twitter"></i></a> <a href="#"><i class="fa fa-instagram"></i></a>
	</div>
	<div class="humberger__menu__contact">
		<ul>
			<li><i class="fa fa-envelope"></i> Thucphamsach@bodtz.com</li>
			<li>An toàn vệ sinh thực phẩm vì chính sức khỏe của bạn !</li>
		</ul>
	</div>
</div>
<!-- Humberger End -->
<!-- Header Section Begin -->
<header class="header">
	<div class="header__top">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6">
					<div class="header__top__left">
						<ul>
							<li><i class="fa fa-envelope"></i> Thucphamsach@bodtz.com</li>
							<li>An toàn vệ sinh thực phẩm vì chính sức khỏe của bạn !</li>
						</ul>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<div class="header__top__right">
						<div class="header__top__right__social">
							<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-instagram"></i></a>
						</div>
						<c:if test="${ empty userInfo }">
							<div class="header__top__right__auth">
								<a href="/SpringMVC/dang-nhap"><i class="fa fa-user"></i>
									Login</a>
							</div>
						</c:if>
						<c:if test="${ not empty userInfo }">
							<div class="dropdown">
								<span>Xin chào ${ userInfo.name }</span>
								<div class="dropdown-content">
									<a href="/SpringMVC/dang-xuat"><i class="fa fa-user"></i>
									Đăng xuất</a>
								</div>
							</div>
						</c:if>

					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="header__logo">
					<a href="/SpringMVC"><img
						src="<c:url value = "/assets/img/logo.png"/>" alt=""></a>
				</div>
			</div>
			<div class="col-lg-6">
				<nav class="header__menu">
					<ul>
						<li class="active"><a href="./index.html">Home</a></li>
						<li><a href="/SpringMVC/gio-hang">Giỏ Hàng</a></li>
						<li><a href="./contact.html">Liên hệ</a></li>
					</ul>
				</nav>
			</div>
			<div class="col-lg-3">
				<div class="header__cart">
					<ul>
						<li><a href="#"><i class="fa fa-tags"></i></a></li>
						<li>[${ CartQuanty }] <a href="/SpringMVC/gio-hang"><i
								class="fa fa-shopping-basket"></i></a></li>
						<li><a hreflang="#"><i class="fa fa-smile-o"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="humberger__open">
			<i class="fa fa-bars"></i>
		</div>
	</div>
</header>
<!-- Header Section End -->
