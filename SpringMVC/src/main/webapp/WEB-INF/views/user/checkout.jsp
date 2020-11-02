<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<form action="#">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<div class="checkout__input">
								<p>
									Họ tên<span>*</span>
								</p>
								<input style="color:black" type="text" value="">
							</div>
							<div class="checkout__input">
								<p>
									Địa chỉ<span>*</span>
								</p> 
								<input style="color:black" type="text" placeholder="Số nhà, tên đường, phường, quận"
									class="checkout__input__add">
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Số điện thoại<span>*</span>
										</p>
										<input style="color:black" type="text">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Email<span>*</span>
										</p>
										<input style="color:black" type="text">
									</div>
								</div>
							</div>
							<div class="checkout__input">
								<p>
									Ghi chú<span>*</span>
								</p>
								<input style="color:black" type="text"
									placeholder="Ghi chú yêu cầu của bạn">
							</div>
						</div>
						<div class="col-lg-4 col-md-6">
							<div class="checkout__order">
								<h4>Hóa đơn</h4>
								<div class="checkout__order__products">
									Sản phẩm <span>Thành tiền</span>
								</div>
								<ul>
									<li>Vegetable’s Package <span>$75.99</span></li>

								</ul>
								<div class="checkout__order__subtotal">
									Thành tiền <span>$750.99</span>
								</div>
								<div class="checkout__order__total">
									Tổng tiền <span>$750.99</span>
								</div>
								<button type="submit" class="site-btn">Thanh toán</button>
							</div>
						</div> 
					</div>
				</form>
			</div>
		</div>
	</section>
	<!-- Checkout Section End -->

</body>
</html>