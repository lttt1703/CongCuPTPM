<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giỏ hàng</title>
</head>
<body>

	<!-- Breadcrumb Section Begin -->
	<section class="breadcrumb-section set-bg"
		data-setbg="<c:url value="assets/img/breadcrumb.jpg"/>">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<div class="breadcrumb__text">
						<h2>GIỎ HÀNG</h2>
						<div class="breadcrumb__option">
							<a href="/SpringMVC/">Home</a> <span>Shopping Cart</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Breadcrumb Section End -->

	<!-- Shoping Cart Section Begin -->
	<section class="shoping-cart spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="shoping__cart__table">
						<table>
							<thead>
								<tr>
									<th class="shoping__product">Sản phẩm</th>
									<th>Giá</th>
									<th>Số lượng</th>
									<th>Thành tiền</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${ Cart }">
									<tr>
										<td class="shoping__cart__item"><img width="100"
											height="100" src="${ item.value.product.image }" alt="">
											<h5>${ item.value.product.name }</h5></td>
										<td class="shoping__cart__price"><fmt:formatNumber
												type="number" groupingUsed="true"
												value="${item.value.product.price}" /> ₫</td>
										<td class="shoping__cart__quantity">
											<div class="quantity">
												<div class="pro-qty">
													<input type="text" id="quanty-cart-${ item.key }"
														value="${ item.value.quanty }">
												</div>
											</div>
										</td>
										<td class="shoping__cart__total"><fmt:formatNumber
												type="number" groupingUsed="true"
												value="${item.value.product.price * item.value.quanty}" />
											₫</td>
										<td class="shoping__cart__item__close"><button
												data-id="${ item.key }" type="button"
												class="btn btn-info btn-mini edit-cart">update</button></td>
										<td class="shoping__cart__item__close"><a
											href="/SpringMVC/DeleteCart/${ item.key }"><span
												class="icon_close"></span></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<c:if test="${ empty Cart }">
				<h4 style="display: flex; justify-content: center; color:#B62708">Giỏ hàng
					trống, mời bạn chọn thêm sản phẩm!</h4>
			</c:if>
			<div class="row">
				<div class="col-lg-12">
					<div class="shoping__cart__btns">
						<a href="/SpringMVC" class="primary-btn">Tiếp tục mua
							hàng</a>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="shoping__checkout">
						<h5>Giỏ hàng</h5>
						<ul>
							<li>Tổng tiền <span><fmt:formatNumber type="number"
										groupingUsed="true" value="${ CartPrice }" /> ₫</span></li>
						</ul>
						<c:if test="${ not empty userInfo }">
							<a href="<c:url value="/check-out"/>" class="primary-btn">Thanh
								toán</a>
						</c:if>
						<c:if test="${ empty userInfo }">
							<a href="<c:url value="/dang-nhap"/>"
								class="primary-btn check-out">Thanh toán</a>
						</c:if>

					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Shoping Cart Section End -->

</body>

<content tag="script"> <script>
	$(".edit-cart").on("click", function() {
		var id = $(this).data("id");
		var quanty = $("#quanty-cart-" + id).val();
		window.location = "EditCart/" + id + "/" + quanty;
	});

</script> </content>

</html>