<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.header__menu {
	display: flex;
	justify-content: center
}
</style>
<!--Load trang-->
<div id="preloder">
	<div class="loader"></div>
</div>


<div class="humberger_menu_overlay"></div>
<div class="humberger__menu__wrapper">
	<div class="humberger__menu__logo">
		<a href="#"><img src="<c:url value = "/assets/img/logo.png"/>" alt=""></a>
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
			<li><a href="#">Giỏ hàng</a></li>
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
						<div class="header__top__right__auth">
							<a href="/SpringMVC/dang-nhap"><i class="fa fa-user"></i>
								Login</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="header__logo">
					<a href="/SpringMVC"><img src="<c:url value = "/assets/img/logo.png"/>" alt=""></a>
				</div>
			</div>
			<div class="col-lg-6">
				<nav class="header__menu">
					<ul>
						<li class="active"><a href="./index.html">Home</a></li>
						<li><a href="#">Giỏ Hàng</a></li>
						<li><a href="./contact.html">Liên hệ</a></li>
					</ul>
				</nav>
			</div>
			<div class="col-lg-3">
				<div class="header__cart">
					<ul>
						<li><a href="#"><i class="fa fa-tags"></i></a></li>
						<li><a hreflang="#"><i class="fa fa-shopping-basket"></i></a></li>
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
