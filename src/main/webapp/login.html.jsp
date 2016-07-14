<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/url.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="keywords" content="">
		<meta name="description" content="">
		<!-- SITE TITLE -->
		<title>Do API - 登录</title>
		<link rel="shortcut icon" type="image/x-icon" href="${URL}/images/favicon.ico" />
		<!-- STYLESHEETS -->
		<link rel="stylesheet" href="${URL}/css/bootstrap.min.css">
		<link rel="stylesheet" href="${URL}/css/font-awesome.min.css">
		<link rel="stylesheet" href="${URL}/css/templatemo_style.css">

	</head>

	<body class="templatemo-bg-gray" data-spy="scroll" data-target="#rock-navigation">
		<!-- START NAVIGATION -->
		<div class="navbar navbar-default bs-dos-nav" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button class="navbar-toggle" data-toggle="collapse" data-target="#rock-navigation">
						<span class="icon icon-bar"></span>
						<span class="icon icon-bar"></span>
						<span class="icon icon-bar"></span>
					</button>
					<div>
						<a href="#" class="navbar-brand" style="float: none;">Do - API</a>
						<p style="color: #666666; font-size: 15px;">虚拟接口,做接口就是这么简单</p>
					</div>
				</div>
				<nav class="collapse navbar-collapse" id="rock-navigation">
					<ul class="nav navbar-nav navbar-right main-navigation text-uppercase">
						<li><a href="${URL}/#home" class="smoothScroll">首页</a></li>
						<li><a href="${URL}/#work" class="smoothScroll">我们在做</a></li>
						<li><a href="#" class="smoothScroll">登录</a></li>
						<li><a href="${URL}/web/forward/register.html" class="smoothScroll">注册</a></li>
					</ul>
				</nav>

			</div>
		</div>
		<!-- END NAVIGATION -->
		<section id="login" style="padding-top: 20px;">
			<div class="container">
				<div class="col-md-12">
					<h1 class="margin-bottom-15">欢迎您的登录</h1>
					<div class=" templatemo-container templatemo-login-form-1 margin-bottom-30" style="height: 300px;">

						<div class="col-md-4 text-center" style="margin-top: 60px;">
							<a href="#"><i class="fa fa-weibo login-with"></i></a>
							<p class="templatemo-create-new" style="padding-top: 10px;">新浪微博</p>
						</div>
						<div class="col-md-4 text-center" style="margin-top: 60px;">
							<a href="#"><i class="fa fa-qq login-with"></i></a>
							<p class="templatemo-create-new" style="padding-top: 10px;">QQ</p>
						</div>
						<div class="col-md-4 text-center" style="margin-top: 60px;">
							<a href="#"><i class="fa fa-weixin login-with"></i></a>
							<p class="templatemo-create-new" style="padding-top: 10px;">微信</p>
						</div>

					</div>

				</div>
				<div class="text-center">
					<a href="${URL}/web/forward/register.html" class="templatemo-create-new">使用邮箱注册一个新账户 <i class="fa fa-chevron-right"></i></a>
				</div>
			</div>
		</section>
		<footer class="footer navbar-fixed-bottom ">
			<div class="container">
				<div class="text-center">
					<p style="color: #999999;">版权所有(C) 北京布衣科技有限公司 ICP证号：京ICP备14015023号-2</p>
				</div>
			</div>
		</footer>

		<script src="${URL}/js/jquery.js"></script>
		<script src="${URL}/js/bootstrap.min.js"></script>
	</body>

</html>