<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thanh toán</title>
</head>
<body>
	<!-- Checkout Section Begin -->
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<h4>Thông Tin Khách Hàng</h4>
				<form:form action="check-out" method="POST" modelAttribute="bill">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<div class="checkout__input">
								<p>
									Họ tên<span>*</span>
								</p>
								<input style="color: black" type="text"
									value="${ userInfo.name }">
							</div>
							<div class="checkout__input">
								<p>
									Địa chỉ<span>*</span>
								</p>
								<form:input type="text" class="form-control" path="address" />
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Số điện thoại<span>*</span>
										</p>
										<form:input type="text" class="form-control" path="phone" />
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Email<span>*</span>
										</p>
										<input style="color: black" type="text"
											value=${ userInfo.email }>
									</div>
								</div>
							</div>
							<div class="checkout__input">
								<p>
									Ghi chú<span>*</span>
								</p>
								<form:input type="text" class="form-control" path="note" />
							</div>
						</div>
						<div class="col-lg-4 col-md-6">
							<div class="checkout__order">
								<h4>Hóa đơn</h4>
								<div class="checkout__order__products">
									Sản phẩm  <span>Thành tiền </span>
								</div>
								<ul>
									<c:forEach var="item" items="${ Cart }">
										<li>${ item.value.product.name } <span>${item.value.product.price * item.value.quanty}</span></li>
									</c:forEach>


								</ul>
								<div class="checkout__order__subtotal">
									Số lượng
									<form:label path="quanty">${ CartQuanty }</form:label>
								</div>
								<div class="checkout__order__total">
									Tổng tiền
									<form:label path="total">${ CartPrice }</form:label>
								</div>
								<button type="submit" class="site-btn checkout-info">Thanh
									toán</button>
							</div>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</section>
	<!-- Checkout Section End -->

</body>
<!--
<content tag="script"> <script>
	$(".checkout-info").on("click", function() {
		alert("Đặt hàng thành công!")
	});
</script> </content>
-->
</html>