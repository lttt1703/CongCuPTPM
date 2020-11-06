<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<style>
</style>

<!-- Page Wrapper -->
<div id="wrapper">

	<!-- Sidebar -->
	<ul
		class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
		id="accordionSidebar">

		<!-- Sidebar - Brand -->
		<a
			class="sidebar-brand d-flex align-items-center justify-content-center"
			href="<c:url value="/admin/trang-chu"/>">
			<div class="sidebar-brand-icon rotate-n-15">
				<i class="fas fa-laugh-wink"></i>
			</div>
			<div class="sidebar-brand-text mx-3">Admin</div>
		</a>

		<!-- Divider -->
		<hr class="sidebar-divider my-0">

		<!-- Nav Item - Dashboard -->
		<li class="nav-item active"><a class="nav-link"
			href="<c:url value="/admin/trang-chu"/>"> <i
				class="fas fa-fw fa-tachometer-alt"></i> <span>Tổng quan</span>
		</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider">

		<!-- Heading -->
		<div class="sidebar-heading">Interface</div>
		<!-- Nav Item - Utilities Collapse Menu -->
		<li class="nav-item"><a class="nav-link" href="<c:url value="/admin/danh-sach-don-hang"/>">
				<i class="fas fa-fw fa-table"></i> <span>Đơn hàng</span>
		</a></li>
		<!-- Nav Item - Pages Collapse Menu -->
		<li class="nav-item"><a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapsePages"
			aria-expanded="true" aria-controls="collapsePages"> <i
				class="fas fa-fw fa-folder"></i> <span>Sản Phẩm</span>
		</a>
			<div id="collapsePages" class="collapse"
				aria-labelledby="headingPages" data-parent="#accordionSidebar">
				<div class="bg-white py-2 collapse-inner rounded">
					<h6 class="collapse-header">Products</h6>
					<a class="collapse-item" href="<c:url value="/admin/danh-sach-san-pham"/>">Danh sách sản phẩm</a> <a
						class="collapse-item" href="<c:url value="/admin/danh-sach-danh-muc"/>">Danh sách danh mục</a> <a
						class="collapse-item" href="<c:url value="/admin/them-san-pham"/>">Thêm sản phẩm mới</a> <a
						class="collapse-item" href="<c:url value="/admin/them-danh-muc"/>">Thêm danh mục mới</a>
				</div>
			</div></li>

		<!-- Nav Item - Charts -->
		<li class="nav-item"><a class="nav-link"
			href="<c:url value="/admin/danh-sach-nguoi-dung"/>"> <i
				class="fas fa-fw fa-chart-area"></i> <span>Quản lí tài khoản
					user</span></a></li>
		<!-- Nav Item - Tables --> 
		</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider d-none d-md-block">

		<!-- Sidebar Toggler (Sidebar) -->
		<div class="text-center d-none d-md-inline">
			<button class="rounded-circle border-0" id="sidebarToggle"></button>
		</div>

	</ul>
	<!-- End of Sidebar -->

	<!-- Content Wrapper -->
	<div id="content-wrapper" class="d-flex flex-column">

		<!-- Main Content -->
		<div id="content">

			<!-- Topbar -->
			<nav
				class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

				<!-- Sidebar Toggle (Topbar) -->
				<button id="sidebarToggleTop"
					class="btn btn-link d-md-none rounded-circle mr-3">
					<i class="fa fa-bars"></i>
				</button>

				<!-- Topbar Search -->
				<form
					class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
					<div class="input-group">
						<input type="text" class="form-control bg-light border-0 small"
							placeholder="Search for..." aria-label="Search"
							aria-describedby="basic-addon2">
						<div class="input-group-append">
							<button class="btn btn-primary" type="button">
								<i class="fas fa-search fa-sm"></i>
							</button>
						</div>
					</div>
				</form>

				<!-- Topbar Navbar -->
				<ul class="navbar-nav ml-auto">

					<!-- Nav Item - Search Dropdown (Visible Only XS) -->
					<li class="nav-item dropdown no-arrow d-sm-none"><a
						class="nav-link dropdown-toggle" href="#" id="searchDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
					</a> <!-- Dropdown - Messages -->
						<div
							class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
							aria-labelledby="searchDropdown">
							<form class="form-inline mr-auto w-100 navbar-search">
								<div class="input-group">
									<input type="text" class="form-control bg-light border-0 small"
										placeholder="Search for..." aria-label="Search"
										aria-describedby="basic-addon2">
									<div class="input-group-append">
										<button class="btn btn-primary" type="button">
											<i class="fas fa-search fa-sm"></i>
										</button>
									</div>
								</div>
							</form>
						</div></li>
					<div class="topbar-divider d-none d-sm-block"></div>
					<c:if test="${ empty adminInfo }">
						<div class="header__top__right__auth">
							<a href="/SpringMVC/admin/dang-nhap"><i class="fa fa-user"></i>
								Login</a>
						</div>
					</c:if>
					<c:if test="${ not empty adminInfo }">
						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small">ADMIN</span>
								<img class="img-profile rounded-circle"
								src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
						</a> <!-- Dropdown - User Information -->
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">
								<a class="dropdown-item" href="#"> <i
									class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
									Settings
								</a>
								<div class="dropdown-divider"></div>
								<a href="/SpringMVC/admin/dang-xuat"><i class="fa fa-user"></i>
									Đăng xuất</a>
							</div></li>
					</c:if>

				</ul>
			</nav>
			<!-- End of Topbar -->
			<decorator:body></decorator:body>
			<!-- /.container-fluid -->

		</div>

	</div>
	<!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

