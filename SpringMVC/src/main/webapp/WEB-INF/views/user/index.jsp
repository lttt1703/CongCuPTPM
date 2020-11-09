<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<title>Cửa hàng Thực Phẩm - OGANI</title>
<body>
	<!-- Hero Section Begin -->
	<section class="hero">
		<div class="container">
			<div class="row">
				<div class="col-lg-3">
					<div class="hero__categories">
						<div class="hero__categories__all">
							<i class="fa fa-bars"></i> <span>All FOODS</span>
						</div>
						<ul>
							<c:forEach var="item" items="${ categories }">
								<li><a href='<c:url value="/danh-muc/${ item.id }" />'>${ item.name }</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>
				<div class="col-lg-9">
					<div class="hero__search">
						<div class="hero__search__form">
							<form action="#">
								<input type="text" placeholder="Bạn cần tìm kiếm gì ?" id="search-input">
								<button type="button" class="site-btn search">SEARCH</button>
							</form>
						</div>
						<div class="hero__search__phone">
							<div class="hero__search__phone__icon">
								<i class="fa fa-phone"></i>
							</div>
							<div class="hero__search__phone__text">
								<h5>+8450.111.222</h5>
								<span>support 24/7 time</span>
							</div>
						</div>
					</div>
					<div class="hero__item set-bg"
						data-setbg="<c:url value="/assets/img/hero/banner.jpg"/>">
						<div class="hero__text">
							<span>FRUIT FRESH</span>
							<h2>
								Vegetable <br>100% Organic
							</h2>
							<span>Path to Healthy <br> Way to Green
							</span> <br> <a href="#" class="primary-btn">SHOP NOW</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Hero Section End -->
	<!-- Categories Section Begin -->
	<section class="categories">
		<div class="container">
			<div class="row">
				<div class="categories__slider owl-carousel">
					<c:forEach var="item" items="${ products }">
						<div class="col-lg-3">
							<div class="categories__item set-bg" data-setbg="${ item.image }">
								<h5>
									<a href="/SpringMVC/san-pham/${ item.id }">${ item.name }</a>
								</h5>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</section>
	<!-- Categories Section End -->
	<!-- Featured Section Begin -->
	<section class="featured spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<h2>DANH SÁCH SẢN PHẨM</h2>
					</div>
				</div>
			</div>
			<div class="row featured__filter">
				<c:forEach var="item" items="${ productsPaginate }">
					<div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
						<div class="featured__item">
							<div class="featured__item__pic set-bg"
								data-setbg="${ item.image }">
								<ul class="featured__item__pic__hover">
									<li><a href="#"><i class="fa fa-heart"></i></a></li>
									<li><a href="#"><i class="fa fa-retweet"></i></a></li>
									<li><a href="/SpringMVC/AddCart/${ item.id }"><i
											class="fa fa-shopping-cart"></i></a></li>
								</ul>
							</div>
							<div class="featured__item__text">
								<h6>

									<a href="/SpringMVC/san-pham/${ item.id }">${ item.name } </a>
								</h6>
								<h5>
									<fmt:formatNumber type="number" groupingUsed="true"
										value="${item.price}" />
									₫
								</h5>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- Featured Section End -->


	<div class="product__pagination"
		style="display: flex; justify-content: center; padding: 10px;">
		<c:forEach var="item" begin="1" end="${ paginateInfo.totalPage }"
			varStatus="loop">
			<c:if test="${ (loop.index ) == paginateInfo.currentPage}">
				<a style="background-color: green;"
					href="/SpringMVC/trang-chu/page-${ loop.index}"><c:out
						value="${loop.index}" /></a>
			</c:if>
			<c:if test="${ (loop.index ) != paginateInfo.currentPage}">
				<a href="/SpringMVC/trang-chu/page-${ loop.index}"><c:out
						value="${loop.index}" /></a>
			</c:if>
		</c:forEach>
		<a href="#"><i class="fa fa-long-arrow-right"></i></a>
	</div>

	<!-- Banner Begin -->
	<div class="banner">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-6">
					<div class="banner__pic">
						<img src="assets/img/banner/banner-1.jpg" alt="">
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6">
					<div class="banner__pic">
						<img src="assets/img/banner/banner-2.jpg" alt="">
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Banner End -->
</body>
<content tag="script"> <script>
	$(".search").on("click", function() {
		var search = $("#search-input").val();
		window.location = "tim-kiem/"+search;
	});

</script> </content>
