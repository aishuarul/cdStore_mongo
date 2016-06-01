<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="assets/ico/favicon.png">
<title>CD-Store</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<!-- add theme styles for this template -->
<link id="pagestyle" rel="stylesheet" type="text/css"
	href="assets/css/skin-1.css">

<!-- Custom styles for this template -->
<link href="assets/css/style.css" rel="stylesheet">
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<!-- styles needed by minimalect -->
<link href="assets/css/jquery.minimalect.min.css" rel="stylesheet">
<!-- styles needed by checkRadio -->
<link href="assets/css/ion.checkRadio.css" rel="stylesheet">
<link href="assets/css/ion.checkRadio.cloudy.css" rel="stylesheet">
<!-- styles needed by mCustomScrollbar -->
<link href="assets/css/jquery.mCustomScrollbar.css" rel="stylesheet">


<!-- Just for debugging purposes. -->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->

<!-- include pace script for automatic web page progress bar  -->


<script>
	paceOptions = {
		elements : true
	};
</script>

<script src="assets/js/pace.min.js"></script>
<script type="text/javascript">
	function swapStyleSheet(sheet) {
		document.getElementById('pagestyle').setAttribute('href', sheet);
	}
</script>
<style>
.themeControll {
	background: #2d3e50;
	height: auto;
	width: 100px;
	position: fixed;
	left: 0;
	padding: 20px;
	top: 20%;
	z-index: 999999;
	-webkit-transform: translateX(0);
	-moz-transform: translateX(0);
	-o-transform: translateX(0);
	-ms-transform: translateX(0);
	transform: translateX(0);
	opacity: 1;
	-ms-filter: none;
	filter: none;
	-webkit-transition: opacity .5s linear, -webkit-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	-moz-transition: opacity .5s linear, -moz-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	-o-transition: opacity .5s linear, -o-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	-ms-transition: opacity .5s linear, -ms-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	transition: opacity .5s linear, transform .7s
		cubic-bezier(.56, .48, 0, .99);
}

.themeControll.active {
	display: block;
	-webkit-transform: translateX(-100px);
	-moz-transform: translateX(-100px);
	-o-transform: translateX(-100px);
	-ms-transform: translateX(-1020px);
	transform: translateX(-100px);
	-webkit-transition: opacity .5s linear, -webkit-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	-moz-transition: opacity .5s linear, -moz-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	-o-transition: opacity .5s linear, -o-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	-ms-transition: opacity .5s linear, -ms-transform .7s
		cubic-bezier(.56, .48, 0, .99);
	transition: opacity .5s linear, transform .7s
		cubic-bezier(.56, .48, 0, .99);
}

.themeControll a {
	border-radius: 3px;
	clear: both;
	display: block;
	height: 25px;
	margin-bottom: 4px;
	width: 50px;
}

.tbtn {
	background: #2D3E50;
	color: #FFFFFF !important;
	font-size: 30px;
	height: auto;
	padding: 10px;
	position: absolute;
	right: -40px;
	top: 0;
	width: 40px;
	cursor: pointer;
}

@media ( max-width : 780px) {
	.themeControll {
		display: none;
	}
}
</style>
</head>

<body>

	<!-- Fixed navbar start -->
	<div class="navbar navbar-tshop navbar-fixed-top megamenu"
		role="navigation">


		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only"> Toggle navigation </span> <span
						class="icon-bar"> </span> <span class="icon-bar"> </span> <span
						class="icon-bar"> </span>
				</button>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-cart">
					<i class="fa fa-shopping-cart colorWhite"> </i> <span
						class="cartRespons colorWhite"> Cart ($210.00) </span>
				</button>
				<a class="navbar-brand " href="index.html"> <img
					src="images/product/store.gif" alt="TSHOP">
				</a>

				<!-- this part for mobile -->
				<div class="search-box pull-right hidden-lg hidden-md hidden-sm">
					<div class="input-group">
						<button class="btn btn-nobg getFullSearch" type="button">
							<i class="fa fa-search"> </i>
						</button>
					</div>
					<!-- /input-group -->

				</div>
			</div>

			<!-- Navigation Bar -->
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<!-- change width of megamenu = use class > megamenu-fullwidth, megamenu-60width, megamenu-40width -->
				</ul>

				<!--- this part will be hidden for c	x	 version -->
				<div class="nav navbar-nav navbar-right hidden-xs">
					<div class="dropdown  cartMenu ">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span
							class="cartRespons"> <i class="fa fa-shopping-cart fa-2x "></i>
								<span class="totalTop"> </span></span> <b class="caret"> </b>
						</a>
						<div class="dropdown-menu col-lg-4 col-xs-12 col-md-4 ">
							<div class="w100 miniCartTable scroll-pane">
								<table>
									<tbody class="cartBody">
									</tbody>
								</table>
							</div>
							<!--/.miniCartTable-->

							<div class="miniCartFooter text-right">
								<h3 class="text-right subtotal">Subtotal: $</h3>
								<a class="btn btn-sm btn-primary " href="checkoutCdStore.jsp">
									CHECKOUT </a>
							</div>
							<!--/.miniCartFooter-->

						</div>
						<!--/.dropdown-menu-->
					</div>
					<!--/.cartMenu-->

				</div>
				<!--/.navbar-nav hidden-xs-->
			</div>
			<!--/.nav-collapse -->

		</div>
		<!--/.container -->

		<div class="search-full text-right">
			<a class="pull-right search-close"> <i
				class=" fa fa-times-circle"> </i>
			</a>
			<div class="searchInputBox pull-right">
				<input type="search" data-searchurl="search?=" name="q"
					placeholder="start typing and hit enter to search"
					class="search-input">
				<button class="btn-nobg search-btn" type="submit">
					<i class="fa fa-search"> </i>
				</button>
			</div>
		</div>
		<!--/.search-full-->

	</div>
	<!-- /.Fixed navbar  -->
	<div class="container main-container headerOffset">

		<!--/.row-->


		<div class="row">
			Your Order Has Been Sucessfully Processed
			<a href="index.jsp">Click here</a> to go to continue your shopping
		</div>
	</div>

	<div style="clear: both"></div>
	</div>
	<!-- /.main-container-->
	<div class="gap"></div>


	<!-- Le javascript
================================================== -->

	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="assets/js/jquery/1.8.3/jquery.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.2.0/bootbox.min.js"></script>

	<!-- include  parallax plugin -->
	<script type="text/javascript" src="assets/js/jquery.parallax-1.1.js"></script>

	<!-- optionally include helper plugins -->
	<script type="text/javascript"
		src="assets/js/helper-plugins/jquery.mousewheel.min.js"></script>

	<!-- include mCustomScrollbar plugin //Custom Scrollbar  -->

	<script type="text/javascript"
		src="assets/js/jquery.mCustomScrollbar.js"></script>

	<!-- include checkRadio plugin //Custom check & Radio  -->
	<script type="text/javascript"
		src="assets/js/ion-checkRadio/ion.checkRadio.min.js"></script>

	<!-- include grid.js // for equal Div height  -->
	<script src="assets/js/grids.js"></script>

	<!-- include carousel slider plugin  -->
	<script src="assets/js/owl.carousel.min.js"></script>

	<!-- jQuery minimalect // custom select   -->
	<script src="assets/js/jquery.minimalect.min.js">
		
	</script>

	<!-- include touchspin.js // touch friendly input spinner component   -->
	<script src="assets/js/bootstrap.touchspin.js"></script>

	<!-- include custom script for site  -->
	<script src="assets/js/script.js"></script>


	<script src="assets/js/fall14.js"></script>
	<script src="assets/js/util.js"></script>
</body>
</html>
