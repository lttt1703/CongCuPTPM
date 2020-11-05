<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách đơn hàng</title>
</head>
<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<!-- DataTales Example -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">Chi tiết đơn hàng</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						<thead>
							<tr>
								<th>ID Bill</th>
								<th>Product</th>
								<th>Quanty</th>
								<th>Total</th>
							</tr>
						</thead>
						<c:forEach var="item" items="${ billDetail }">
							<tbody>
								<tr>
									<td>${ item.id_bill }</td>
									<c:forEach var="itemProduct" items="${ products }">
										<c:if test="${ itemProduct.id == item.id_product  }">
											<td>${ itemProduct.name }</td>
										</c:if>
									</c:forEach>
									<td>${ item.quanty }</td>
									<td><fmt:formatNumber type="number" groupingUsed="true"
											value="${item.total}" /> ₫</td>
								</tr>
							</tbody>
						</c:forEach>

					</table>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container-fluid -->
</body>
</html>