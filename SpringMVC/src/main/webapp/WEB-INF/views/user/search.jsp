<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm kiếm</title>
</head>
<body>
	<!-- Product Section Begin -->
	<section class="product spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-5">
					<div class="sidebar">
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
						<div class="sidebar__item">
							<h4>Price</h4>
							<div class="price-range-wrap">
								<div
									class="price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"
									data-min="10" data-max="540">
									<div class="ui-slider-range ui-corner-all ui-widget-header"></div>
									<span tabindex="0"
										class="ui-slider-handle ui-corner-all ui-state-default"></span>
									<span tabindex="0"
										class="ui-slider-handle ui-corner-all ui-state-default"></span>
								</div>
								<div class="range-slider">
									<div class="price-input">
										<input type="text" id="minamount"> <input type="text"
											id="maxamount">
									</div>
								</div>
							</div>
						</div>

						
					</div>
				</div>
				<div class="col-lg-9 col-md-7">
					<div class="product__discount">
						<div class="section-title product__discount__title">
							<h2>Tìm kiếm</h2>

						</div>
					</div>
					<div class="filter__item">
						<div class="row">
							<div class="col-lg-4 col-md-5">
								<div class="filter__sort">
									<span>Sort By</span> <select>
										<option value="0">Default</option>
										<option value="0">Default</option>
									</select>
								</div>
							</div>
							<div class="col-lg-4 col-md-4">
								<div class="filter__found">
									<h6>
										<span>${ productsBySearch.size() }</span> Products found
									</h6>
								</div>
							</div>
							<div class="col-lg-4 col-md-3">
								<div class="filter__option">
									<span class="icon_grid-2x2"></span> <span class="icon_ul"></span>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<c:forEach var="item" items="${ productsBySearch }">
							<div class="col-lg-4 col-md-6 col-sm-6">
								<div class="product__item">
									<div class="product__item__pic set-bg"
										data-setbg="<c:url value = "${ item.image }" />">
										<ul class="product__item__pic__hover">
											<li><a href="#"><i class="fa fa-heart"></i></a></li>
											<li><a href="#"><i class="fa fa-retweet"></i></a></li>
											<li><a href="/SpringMVC/AddCart/${ item.id }"><i class="fa fa-shopping-cart"></i></a></li>
										</ul>
									</div>
									<div class="product__item__text">
										<h6>
											<a href="/SpringMVC/san-pham/${ item.id }">${ item.name }</a>
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
			</div>
		</div>
	</section>
	<!-- Product Section End -->

</body>
</html>