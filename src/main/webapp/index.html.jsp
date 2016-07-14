<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/url.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta name="keywords" content="">
		<meta name="description" content="">
		<!-- SITE TITLE -->
		<title>Do API - 接口神器</title>
		<link rel="shortcut icon" type="image/x-icon" href="${URL}/images/favicon.ico" />
		<!-- STYLESHEETS -->
		<link rel="stylesheet" href="${URL}/css/bootstrap.min.css">
		<link rel="stylesheet" href="${URL}/css/font-awesome.min.css">
		<link rel="stylesheet" href="${URL}/css/templatemo-style.css">
		<link rel="stylesheet" href="${URL}/css/animate.css">
	</head>

	<body data-spy="scroll" data-target="#rock-navigation">
		<!-- START NAVIGATION -->
		<div class="navbar navbar-default bs-dos-nav navbar-fixed-top sticky-navigation" role="navigation">
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
						<li><a href="#home" class="smoothScroll">首页</a></li>
						<li><a href="#work" class="smoothScroll">我们在做</a></li>
						<li><a href="${URL}/web/forward/login.html" class="smoothScroll">登录</a></li>
						<li><a href="${URL}/web/forward/register.html" class="smoothScroll">注册</a></li>
					</ul>
				</nav>

			</div>
		</div>
		<!-- END NAVIGATION -->

		<!-- START HOME -->
		<section id="home" class="templatemo-home">

			<div class="container" style="margin-top: -200px;">

				<video autoplay loop id="bgvid" poster="${URL}/images/polina.png">
			       <source src="${URL}/images/Home.mp4">
			       <!--[if LT IE 9]>
			       <object type="application/x-shockwave-flash" data="http://flashfox.googlecode.com/svn/trunk/flashfox.swf" width="100%" height="770">
			           <param name="movie" value="http://flashfox.googlecode.com/svn/trunk/flashfox.swf">
			           <param name="allowFullScreen" value="true">
			           <param name="wmode" value="transparent">
			           <param name="flashVars" value="autoplay=true&controls=false&loop=true&poster=${URL}/images/polina.png&src=${URL}/images/Home.mp4">
			       </object>
			       <![endif]-->
			   	</video>

				<div class="row">
					<div style="width: 100%;height:100%;background-color: #000000;"></div>
					<div class="col-md-2 col-sm-1"></div>
					<div class="col-md-8 col-sm-10">
						<h1 class="tm-home-title"><strong>Do - Api</strong></h1>
						<h2 class="tm-home-subtitle">接口神器</h2>
						<h4 class="sm1">自定义假数据接口,模拟线上环境,加速应用程序开发,让API文档管理更高效.</h4>
						<p class="sm2"><strong>接口先行,数据库设计先行,前后台并行开发!</strong></p>
						<a href="${URL}/web/forward/login.html" class="btn btn-default smoothScroll tm-view-more-btn kaishi">开 始 使 用</a>
					</div>
					<div class="col-md-2 col-sm-1"></div>
				</div>

			</div>

		</section>
		<!-- END HOME -->

		<!-- START work -->
		<section id="work" class="tm-padding-top-bottom-100">
			<div class="container">
				<div class="row">
					<div class="col-md-offset-1 col-md-11">
						<h2 class="title">我们 <strong>在做</strong></h2>
					</div>
					<div class="col-md-4 col-sm-4">
						<div class="work-wrapper">
							<i class="fa fa-exchange"></i>
							<h3 class="text-uppercase tm-work-h3">接口自定义</h3>
							<hr>
							<p>用户可以自定义字段、返回数据、请求方式等.用户可以模拟出和真实后台接口一致的效果,最终程序员只需要统一修改服务器地址,就能完成和后台的实际数据对接.</p>
						</div>
					</div>
					<div class="col-md-4 col-sm-4">
						<div class="work-wrapper">
							<i class="fa fa-suitcase"></i>
							<h3 class="text-uppercase tm-work-h3">接口文档自动生成</h3>
							<hr>
							<p>用户可以随时随地查阅在线接口文档,前后台都可以按照接口文档上的内容,进行分离甚至异地开发,前后台不再需要经常调试接口.减少了沟通成本,加快了开发进度.</p>
						</div>
					</div>
					<div class="col-md-4 col-sm-4">
						<div class="work-wrapper">
							<i class="fa fa-stethoscope"></i>
							<h3 class="text-uppercase tm-work-h3">实体类自动生成</h3>
							<hr>
							<p>用户创建好接口后,系统会同时自动生成包括JAVA,PHP,Android,iOS等对应的实体类,程序员只需要下载相应的文件加入工程,保证了各端数据结构一致!进度加快.</p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- END work -->

		<footer class="footer">
			<div class="container">
				<div class="text-center">
					<p style="color: #999999;">版权所有(C) 北京布衣科技有限公司 ICP证号：京ICP备14015023号-2</p>
				</div>
			</div>
		</footer>

		<script src="${URL}/js/jquery.js"></script>
		<script src="${URL}/js/bootstrap.min.js"></script>
		<script src="${URL}/js/smoothscroll.js"></script>
		<script src="${URL}/js/jquery.nav.js"></script>
		<script src="${URL}/js/imagesloaded.min.js"></script>
		<script src="${URL}/js/custom.js"></script>
	</body>

</html>