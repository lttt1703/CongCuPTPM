<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Ogani Template">
<meta name="keywords" content="Ogani, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Ogani | Template</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>

	<c:forEach var="item" items="${ productsById }">
		<!-- Breadcrumb Section Begin -->
		<section class="breadcrumb-section set-bg"
			data-setbg="<c:url value="/assets/img/breadcrumb.jpg"/>">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 text-center">
						<div class="breadcrumb__text">
							<h2>CHI TIẾT SẢN PHẨM</h2>
							<div class="breadcrumb__option">
								<a href="./index.html">Home</a> <a href="./index.html">Vegetables</a>
								<span>Vegetable’s Package</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Breadcrumb Section End -->

		<!-- Product Details Section Begin -->
		<section class="product-details spad">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-6">
						<div class="product__details__pic">
							<div class="product__details__pic__item">
								<img class="product__details__pic__item--large"
									src="${ item.image }"
									alt="">
							</div>
						</div>
					</div>
					<div class="col-lg-6 col-md-6">
						<div class="product__details__text">
							<h3>${ item.name }</h3>
							<div class="product__details__rating">
								<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star-half-o"></i> <span>(18 reviews)</span>
							</div>
							<div class="product__details__price">
								<fmt:formatNumber type="number" groupingUsed="true"
									value="${item.price}" />
								₫
							</div>
							<p>${ item.detail }</p>
							<div class="product__details__quantity">
								<div class="quantity">
									<div class="pro-qty">
										<input type="text" value="1">
									</div>
								</div>
							</div>
							<a href="#" class="primary-btn">ADD TO CARD</a> <a href="#"
								class="heart-icon"><span class="icon_heart_alt"></span></a>
							<ul>
								<li><b>Tình trạng</b> <span>Còn hàng</span></li>
								<li><b>Giao hàng</b> <span>2 giờ <samp>Miễn phí
											giao hàng</samp></span></li>
								<li><b>Khối lượng</b> <span>0.5 kg</span></li>
								<li><b>Chia sẻ</b>
									<div class="share">
										<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
											class="fa fa-twitter"></i></a> <a href="#"><i
											class="fa fa-instagram"></i></a> <a href="#"><i
											class="fa fa-pinterest"></i></a>
									</div></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-12">
						<div class="product__details__tab">
							<ul class="nav nav-tabs" role="tablist">
								<li class="nav-item"><a class="nav-link active"
									data-toggle="tab" href="#tabs-1" role="tab"
									aria-selected="true">Mô tả</a></li>
								<li class="nav-item"><a class="nav-link" data-toggle="tab"
									href="#tabs-2" role="tab" aria-selected="false">Thông tin</a>
								</li>
								<li class="nav-item"><a class="nav-link" data-toggle="tab"
									href="#tabs-3" role="tab" aria-selected="false">Nhận xét <span>(1)</span></a>
								</li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="tabs-1" role="tabpanel">
									<div class="product__details__tab__desc">
										<h6>Products Infomation</h6>
										<p>Vestibulum ac diam sit amet quam vehicula elementum sed
											sit amet dui. Pellentesque in ipsum id orci porta dapibus.
											Proin eget tortor risus. Vivamus suscipit tortor eget felis
											porttitor volutpat. Vestibulum ac diam sit amet quam vehicula
											elementum sed sit amet dui. Donec rutrum congue leo eget
											malesuada. Vivamus suscipit tortor eget felis porttitor
											volutpat. Curabitur arcu erat, accumsan id imperdiet et,
											porttitor at sem. Praesent sapien massa, convallis a
											pellentesque nec, egestas non nisi. Vestibulum ac diam sit
											amet quam vehicula elementum sed sit amet dui. Vestibulum
											ante ipsum primis in faucibus orci luctus et ultrices posuere
											cubilia Curae; Donec velit neque, auctor sit amet aliquam
											vel, ullamcorper sit amet ligula. Proin eget tortor risus.</p>
										<p>Praesent sapien massa, convallis a pellentesque nec,
											egestas non nisi. Lorem ipsum dolor sit amet, consectetur
											adipiscing elit. Mauris blandit aliquet elit, eget tincidunt
											nibh pulvinar a. Cras ultricies ligula sed magna dictum
											porta. Cras ultricies ligula sed magna dictum porta. Sed
											porttitor lectus nibh. Mauris blandit aliquet elit, eget
											tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam
											vehicula elementum sed sit amet dui. Sed porttitor lectus
											nibh. Vestibulum ac diam sit amet quam vehicula elementum sed
											sit amet dui. Proin eget tortor risus.</p>
									</div>
								</div>
								<div class="tab-pane" id="tabs-2" role="tabpanel">
									<div class="product__details__tab__desc">
										<h6>Products Infomation</h6>
										<p>Vestibulum ac diam sit amet quam vehicula elementum sed
											sit amet dui. Pellentesque in ipsum id orci porta dapibus.
											Proin eget tortor risus. Vivamus suscipit tortor eget felis
											porttitor volutpat. Vestibulum ac diam sit amet quam vehicula
											elementum sed sit amet dui. Donec rutrum congue leo eget
											malesuada. Vivamus suscipit tortor eget felis porttitor
											volutpat. Curabitur arcu erat, accumsan id imperdiet et,
											porttitor at sem. Praesent sapien massa, convallis a
											pellentesque nec, egestas non nisi. Vestibulum ac diam sit
											amet quam vehicula elementum sed sit amet dui. Vestibulum
											ante ipsum primis in faucibus orci luctus et ultrices posuere
											cubilia Curae; Donec velit neque, auctor sit amet aliquam
											vel, ullamcorper sit amet ligula. Proin eget tortor risus.</p>
										<p>Praesent sapien massa, convallis a pellentesque nec,
											egestas non nisi. Lorem ipsum dolor sit amet, consectetur
											adipiscing elit. Mauris blandit aliquet elit, eget tincidunt
											nibh pulvinar a. Cras ultricies ligula sed magna dictum
											porta. Cras ultricies ligula sed magna dictum porta. Sed
											porttitor lectus nibh. Mauris blandit aliquet elit, eget
											tincidunt nibh pulvinar a.</p>
									</div>
								</div>
								<div class="tab-pane" id="tabs-3" role="tabpanel">
									<div class="product__details__tab__desc">
										<h6>Products Infomation</h6>
										<p>Vestibulum ac diam sit amet quam vehicula elementum sed
											sit amet dui. Pellentesque in ipsum id orci porta dapibus.
											Proin eget tortor risus. Vivamus suscipit tortor eget felis
											porttitor volutpat. Vestibulum ac diam sit amet quam vehicula
											elementum sed sit amet dui. Donec rutrum congue leo eget
											malesuada. Vivamus suscipit tortor eget felis porttitor
											volutpat. Curabitur arcu erat, accumsan id imperdiet et,
											porttitor at sem. Praesent sapien massa, convallis a
											pellentesque nec, egestas non nisi. Vestibulum ac diam sit
											amet quam vehicula elementum sed sit amet dui. Vestibulum
											ante ipsum primis in faucibus orci luctus et ultrices posuere
											cubilia Curae; Donec velit neque, auctor sit amet aliquam
											vel, ullamcorper sit amet ligula. Proin eget tortor risus.</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Product Details Section End -->

	</c:forEach>

</body>

</html>