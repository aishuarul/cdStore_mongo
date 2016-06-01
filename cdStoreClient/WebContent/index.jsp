<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="assets/ico/favicon.png">
<title>CD Store</title>
<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<link href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<!-- add theme styles for this template -->
<link id="pagestyle" rel="stylesheet" type="text/css" href="assets/css/skin-1.css">

<!-- Custom styles for this template -->
<link href="assets/css/style.css" rel="stylesheet">

<!-- css3 animation effect for this template -->
<link href="assets/css/animate.min.css" rel="stylesheet">

<!-- styles needed by carousel slider -->
<link href="assets/css/owl.carousel.css" rel="stylesheet">
<link href="assets/css/owl.theme.css" rel="stylesheet">

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
      elements: true
    };
</script>
<script src="assets/js/pace.min.js"></script>
    <script type="text/javascript">
function swapStyleSheet(sheet){
document.getElementById('pagestyle').setAttribute('href', sheet);
}
</script>    <style>

	.themeControll {
		background:#2d3e50;
		height: auto;
		width:100px;
		position:fixed;
		left:0;
		padding:20px;
		top:20%;
		z-index:999999;
		-webkit-transform: translateX(0);
		-moz-transform: translateX(0);
		-o-transform: translateX(0);
		-ms-transform: translateX(0);
		transform: translateX(0);
		opacity: 1;
		-ms-filter: none;
		filter: none;
		-webkit-transition: opacity .5s linear, -webkit-transform .7s cubic-bezier(.56, .48, 0, .99);
		-moz-transition: opacity .5s linear, -moz-transform .7s cubic-bezier(.56, .48, 0, .99);
		-o-transition: opacity .5s linear, -o-transform .7s cubic-bezier(.56, .48, 0, .99);
		-ms-transition: opacity .5s linear, -ms-transform .7s cubic-bezier(.56, .48, 0, .99);
		transition: opacity .5s linear, transform .7s cubic-bezier(.56, .48, 0, .99);
	}
	
	.themeControll.active {
		display: block;
		-webkit-transform: translateX(-100px);
		-moz-transform: translateX(-100px);
		-o-transform: translateX(-100px);
		-ms-transform: translateX(-1020px);
		transform: translateX(-100px);
		-webkit-transition: opacity .5s linear, -webkit-transform .7s cubic-bezier(.56, .48, 0, .99);
		-moz-transition: opacity .5s linear, -moz-transform .7s cubic-bezier(.56, .48, 0, .99);
		-o-transition: opacity .5s linear, -o-transform .7s cubic-bezier(.56, .48, 0, .99);
		-ms-transition: opacity .5s linear, -ms-transform .7s cubic-bezier(.56, .48, 0, .99);
		transition: opacity .5s linear, transform .7s cubic-bezier(.56, .48, 0, .99);
	
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
    background:#2D3E50;
    color: #FFFFFF !important;
    font-size: 30px;
    height: auto;
    padding: 10px;
    position: absolute;
    right: -40px;
    top: 0;
    width: 40px;
	cursor:pointer;
   }
   
   	@media (max-width: 780px) {
    .themeControll {
        display:none;
    }
}
	
	</style>
	</head>

<body>

<!-- Modal Login start -->
<div class="modal signUpContent fade" id="ModalLogin" tabindex="-1" role="dialog" >
  <div class="modal-dialog ">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button>
        <h3 class="modal-title-site text-center" > Login  to CD STORE </h3>
      </div>
      <div class="modal-body">
       <form method="post"  onsubmit="member.login(this); return false;">
        <div class="form-group login-username">
          <div >
            <input name="username" id="login-user" class="form-control input"   placeholder="Enter Username" type="text">
          </div>
        </div>
        <div class="form-group login-password">
          <div >
            <input name="password" id="login-password" class="form-control input"  size="20" placeholder="Password" type="password">
          </div>
        </div>
        <div >
          <div >
            <input name="submit" class="btn  btn-block btn-lg btn-primary" value="submit" type="submit">
            <input type="hidden" name="method" class="btn  btn-block btn-lg btn-primary" value="login" >
          </div>
        </div>
        </form>
        <!--userForm--> 
        
      </div>
      <div class="modal-footer">
      </div>
    </div>
    <!-- /.modal-content --> 
    
  </div>
  <!-- /.modal-dialog --> 
  
</div>
<!-- /.Modal Login -->

<!-- Modal Signup start -->
<div class="modal signUpContent fade" id="ModalSignup" tabindex="-1" role="dialog" >
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button>
        <h3 class="modal-title-site text-center" > REGISTER </h3>
      </div>
      <form method="post"  onsubmit="member.register(this); return true;">
         <div class="form-group reg-username">
          <div >
            <input name="login"  class="form-control input"  size="20" placeholder="Enter Username" type="text">
          </div>
        </div>
        <div class="form-group reg-email">
          <div >
            <input name="reg"  class="form-control input"  size="20" placeholder="Enter Email" type="text">
          </div>
        </div>
        <div class="form-group reg-password">
          <div >
            <input name="password"  class="form-control input"  size="20" placeholder="Password" type="password">
          </div>
        </div>
        <div >
          <div >
            <input name="submit" class="btn  btn-block btn-lg btn-primary" value="REGISTER" type="submit">
          </div>
        </div>
        </form>
        <!--userForm--> 
        
      </div>
      <div class="modal-footer">
        <p class="text-center"> Already member? <a data-toggle="modal"  data-dismiss="modal" href="#ModalLogin"> Sign in </a> </p>
      </div>
    </div>
    <!-- /.modal-content --> 
    
  </div>
  <!-- /.modal-dialog --> 
  
<!-- /.ModalSignup End --> 

<!-- Fixed navbar start -->
<div class="navbar navbar-tshop navbar-fixed-top megamenu" role="navigation">
  <div class="navbar-top">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 col-sm-6 col-xs-6 col-md-6">
          <div class="pull-left ">
            <ul class="userMenu ">
            </ul>
          </div>
        </div>
        <div class="col-lg-6 col-sm-6 col-xs-6 col-md-6 no-margin no-padding">
        <div class="pull-right">
            <ul class="userMenu">
              <li> <a href="#"  data-toggle="modal" data-target="#ModalLogin"> <span class="hidden-xs">Sign In</span> <i class="glyphicon glyphicon-log-in hide visible-xs "></i> </a> </li>
              <li class="hidden-xs"> <a href="#"  data-toggle="modal" data-target="#ModalSignup"> Create Account </a> </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--/.navbar-top-->
  
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only"> Toggle navigation </span> <span class="icon-bar"> </span> <span class="icon-bar"> </span> <span class="icon-bar"> </span> </button>
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-cart"> <i class="fa fa-shopping-cart colorWhite"> </i> <span class="cartRespons colorWhite"> Cart ($00.00) </span> </button>
      <a class="navbar-brand " href="index.html"> <img src="images/product/store.gif" alt="TSHOP"> </a> 
    </div>
    
    <!-- this part is duplicate from cartMenu  keep it for mobile -->
    <div class="navbar-cart  collapse">
      <div class="cartMenu  col-lg-4 col-xs-12 col-md-4 ">
        <div class="w100 miniCartTable scroll-pane">
          <table  >
            <tbody class="navCart">
            </tbody>
          </table>
        </div>
        <!--/.miniCartTable-->
        
        <div class="miniCartFooter  miniCartFooterInMobile text-right">
          <h3 class="text-right subtotal"> Subtotal: $210 </h3>
          <a class="btn btn-sm btn-primary"> CHECKOUT </a> </div>
        <!--/.miniCartFooter--> 
        
      </div>
      <!--/.cartMenu--> 
    </div>
    <!--/.navbar-cart-->
    
    <div class="navbar-collapse collapse">
      <ul class="nav navbar-nav">
        <!-- change width of megamenu = use class > megamenu-fullwidth, megamenu-60width, megamenu-40width -->
        <li class="dropdown megamenu-80width "> <a data-toggle="dropdown" class="dropdown-toggle" href="#"> Categories <b class="caret"> </b> </a>
          <ul class="dropdown-menu">
            <li class="megamenu-content"> 
              
              <!-- megamenu-content -->
              
              <ul id="categoryUl" class="col-lg-2  col-sm-2 col-md-2  unstyled">
              </ul>
            </li>
          </ul>
        </li>
      </ul>
      
      <!--- this part will be hidden for mobile version -->
      <div class="nav navbar-nav navbar-right hidden-xs">
        <div class="dropdown  cartMenu "> <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span class="cartRespons"> <i class="fa fa-shopping-cart fa-2x "></i> <span class="totalTop"> </span></span> <b class="caret"> </b> </a>
          <div class="dropdown-menu col-lg-4 col-xs-12 col-md-4 ">
            <div class="w100 miniCartTable scroll-pane">
              <table>
                <tbody class="cartBody">
               </tbody>
              </table>
            </div>
            <!--/.miniCartTable-->
            
            <div class="miniCartFooter text-right">
              <h3 class="text-right subtotal"> Subtotal: $ </h3>
              <a class="btn btn-sm btn-primary " href="checkoutCdStore.jsp"> CHECKOUT </a> </div>
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
  
</div>
<!-- /.Fixed navbar  -->

<div class="container main-container headerOffset globalPaddingBottom"> 
  
  <!-- Main component call to action -->
  <div class="row featuredPostContainer ">
    <div class="featured-category"> </div>
    <div style="clear:both;"></div>
    <div id="productslider" class="owl-carousel owl-theme">
    <div class="item">
    <div class="product">
        <div class="image"><a href="product-details.html"><img src="images/product/Thriller.jpg" alt="img" class="img-responsive"></a></div>
        <div class="description">
            <h4><a href="product-details.html">Thriller</a></h4>
            <p>Michael Jackson</p>
            <span class="size">1982</span> 
        </div>
        <div class="price"><span>50</span> </div>
        <div class="action-control"><a class="btn btn-primary" data-id="1"> <span class="add2cart"><i class="glyphicon glyphicon-shopping-cart"></i> Add to cart </span> </a> </div>
    </div>
</div>
<div class="item">
    <div class="product">
        <div class="image"><a href="product-details.html"><img src="images/product/Dangerous.jpg" alt="img" class="img-responsive"></a></div>
        <div class="description">
            <h4><a href="product-details.html">Dangerous</a></h4>
            <p>Michael Jackson</p>
            <span class="size">1982</span> 
        </div>
        <div class="price"><span>50</span> </div>
        <div class="action-control"><a class="btn btn-primary" data-id="2"> <span class="add2cart"><i class="glyphicon glyphicon-shopping-cart"></i> Add to cart </span> </a> </div>
    </div>
</div>
<div class="item">
    <div class="product">
        <div class="image"><a href="product-details.html"><img src="images/product/Eagles.jpg" alt="img" class="img-responsive"></a></div>
        <div class="description">
            <h4><a href="product-details.html">Eagles</a></h4>
            <p>Their Greatest Hits (1971–1975)</p>
            <span class="size">1975</span> 
        </div>
        <div class="price"><span>125</span> </div>
        <div class="action-control"><a class="btn btn-primary" data-id="3"> <span class="add2cart"><i class="glyphicon glyphicon-shopping-cart"></i> Add to cart </span> </a> </div>
    </div>
</div>
    </div>
    <!--/.productslider--> 
    
  </div>
  <!--/.featuredPostContainer--> 
</div>
<!-- /main container -->
<footer>
  <div class="footer" id="footer">
    <div class="container">
      <div class="row">
        <div class="col-lg-3  col-md-3 col-sm-4 col-xs-6">
          <h3> Support </h3>
          <ul>
            <li class="supportLi">
              <p> Help  </p>
              <h4> <a class="inline" href="callto:+8801234567890"> <strong> <i class="fa fa-phone"> </i> 88 01680 531352 </strong> </a> </h4>
              <h4> <a class="inline" href="mailto:help@cdstoreweb.com"> <i class="fa fa-envelope-o"> </i> help@cdstoreweb.com </a> </h4>
            </li>
          </ul>
        </div>
        <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
          <h3> Shop </h3>
          <ul>
            <li> <a href="index.jsp"> Home </a> </li>
            <li> <a href="#"> Category </a> </li>
            <li> <a href="#"> Sub Category </a> </li>
          </ul>
        </div>
        <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
          <h3> Information </h3>
          <ul>
           
            <li> <a href="#"> Contact us </a> </li>
            <li> <a href="#"> Terms &amp; Conditions </a> </li>
          </ul>
        </div>
        <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
          <h3> My Account </h3>
          <ul>
            <li> <a class="orderList"> Order list </a> </li>
          </ul>
        </div>
        <div class="col-lg-3  col-md-3 col-sm-6 col-xs-12 ">
          <h3> Stay in touch </h3>
          <ul>
            <li>
              <div class="input-append newsLatterBox text-center">
                <input type="text" class="full text-center"  placeholder="Email ">
                <button class="btn  bg-gray" type="button"> Subscribe <i class="fa fa-long-arrow-right"> </i> </button>
              </div>
            </li>
          </ul>
          <ul class="social">
            <li> <a href="http://facebook.com"> <i class=" fa fa-facebook"> &nbsp; </i> </a> </li>
            <li> <a href="http://twitter.com"> <i class="fa fa-twitter"> &nbsp; </i> </a> </li>
            <li> <a href="https://plus.google.com"> <i class="fa fa-google-plus"> &nbsp; </i> </a> </li>
            <li> <a href="http://youtube.com"> <i class="fa fa-pinterest"> &nbsp; </i> </a> </li>
            <li> <a href="http://youtube.com"> <i class="fa fa-youtube"> &nbsp; </i> </a> </li>
          </ul>
        </div>
      </div>
      <!--/.row--> 
    </div>
    <!--/.container--> 
  </div>
  <!--/.footer-->
  
  <div class="footer-bottom">
    <div class="container">
      <p class="pull-left"> &copy; E-Commerce Fall2014. All right reserved. </p>
    </div>
  </div>
  <!--/.footer-bottom--> 
</footer>

<!-- Le javascript
================================================== --> 

<!-- Placed at the end of the document so the pages load faster --> 
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="assets/js/idangerous.swiper-2.1.min.js"></script> 
<script src="//cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.2.0/bootbox.min.js"></script>
<script>
//   var mySwiper = new Swiper('.swiper-container',{
// 	pagination: '.box-pagination',
//  keyboardControl: true,
//     paginationClickable: true,
//     slidesPerView: 'auto',
// 	autoResize:true,
// 	resizeReInit:true,
//   })
  
  	 $('.prevControl').on('click', function(e){
    e.preventDefault()
    mySwiper.swipePrev()
  })
  $('.nextControl').on('click', function(e){
    e.preventDefault()
    mySwiper.swipeNext()
  });
	
  $(function(){
	$('.orderList').on('click',function(){
		$('.cartMenu').addClass('open');
	});
 });
  </script> 

<!-- include jqueryCycle plugin --> 
<script src="assets/js/jquery.cycle2.min.js"></script> 

<!-- include easing plugin --> 
<script src="assets/js/jquery.easing.1.3.js"></script> 

<!-- include  parallax plugin --> 
<script type="text/javascript"  src="assets/js/jquery.parallax-1.1.js"></script> 

<!-- optionally include helper plugins --> 
<script type="text/javascript"  src="assets/js/helper-plugins/jquery.mousewheel.min.js"></script> 

<!-- include mCustomScrollbar plugin //Custom Scrollbar  --> 

<script type="text/javascript" src="assets/js/jquery.mCustomScrollbar.js"></script> 

<!-- include checkRadio plugin //Custom check & Radio  --> 
<script type="text/javascript" src="assets/js/ion-checkRadio/ion.checkRadio.min.js"></script> 

<!-- include grid.js // for equal Div height  --> 
<script src="assets/js/grids.js"></script> 

<!-- include carousel slider plugin  --> 
<script src="assets/js/owl.carousel.min.js"></script> 

<!-- jQuery minimalect // custom select   --> 
<script src="assets/js/jquery.minimalect.min.js"></script> 

<!-- include touchspin.js // touch friendly input spinner component   --> 
<script src="assets/js/bootstrap.touchspin.js"></script> 

<!-- include custom script for site  --> 
<script src="assets/js/script.js"></script> 

<!-- include custom script for only homepage  --> 
<script src="assets/js/home.js"></script>
<script src="assets/js/fall14Mongo.js"></script>
</body>
</html>
