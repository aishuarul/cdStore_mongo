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
<title>CD-Store</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<!-- add theme styles for this template -->
<link id="pagestyle" rel="stylesheet" type="text/css" href="assets/css/skin-1.css">

<!-- Custom styles for this template -->
<link href="assets/css/style.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
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

<!-- Fixed navbar start -->
<div class="navbar navbar-tshop navbar-fixed-top megamenu" role="navigation">

  
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only"> Toggle navigation </span> <span class="icon-bar"> </span> <span class="icon-bar"> </span> <span class="icon-bar"> </span> </button>
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-cart"> <i class="fa fa-shopping-cart colorWhite"> </i> <span class="cartRespons colorWhite"> Cart ($210.00) </span> </button>
      <a class="navbar-brand " href="index.html"> <img src="images/product/store.gif" alt="TSHOP"> </a> 
      
      <!-- this part for mobile -->
      <div class="search-box pull-right hidden-lg hidden-md hidden-sm">
        <div class="input-group">
          <button class="btn btn-nobg getFullSearch" type="button"> <i class="fa fa-search"> </i> </button>
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
  
  <div class="search-full text-right"> <a class="pull-right search-close"> <i class=" fa fa-times-circle"> </i> </a>
    <div class="searchInputBox pull-right">
      <input type="search"  data-searchurl="search?=" name="q" placeholder="start typing and hit enter to search" class="search-input">
      <button class="btn-nobg search-btn" type="submit"> <i class="fa fa-search"> </i> </button>
    </div>
  </div>
  <!--/.search-full--> 
  
</div>
<!-- /.Fixed navbar  -->
<div class="container main-container headerOffset">
 
  <!--/.row-->
  
  <div class="row">
    <div class="col-lg-9 col-md-9 col-sm-7">
      <h1 class="section-title-inner"><span><i class="glyphicon glyphicon-shopping-cart"></i> Checkout</span></h1>
    </div>
    <div class="col-lg-3 col-md-3 col-sm-5 rightSidebar">
      <h4 class="caps"><a href="index.jsp"><i class="fa fa-chevron-left"></i> Back to shopping </a></h4>
    </div>
  </div> <!--/.row-->
  
  <div class="row">
    <div class="col-lg-9 col-md-9 col-sm-12" >
      <div class="row userInfo">
        <div class="col-xs-12 col-sm-12" style="padding-bottom: 20px;">
        	<div class="w100 clearfix">
          	<!-- Begin Billing Address -->
            <div class="row userInfo" id="billingAddressInfoDiv">
              <div class="col-lg-12">
                <h2 class="block-title-2"> Billing Address </h2>
              </div>
              <form name="processCDOrderFrom" id="processCDOrderFrom" method="POST" action="MongoProcessOrderController">
              	<div class="col-xs-12 col-sm-6">
	                <div class="form-group required">
	                  <label for="InputName">First Name <sup>*</sup> </label>
	                  <input required type="text" class="form-control" name="InputFirstName" id="InputFirstName" placeholder="First Name">
	                </div>
	                <div class="form-group required">
	                  <label for="InputLastName">Last Name <sup>*</sup> </label>
	                  <input required type="text" class="form-control" name="InputLastName" id="InputLastName" placeholder="Last Name">
	                </div>
	                <div class="form-group">
	                  <label for="InputEmail">Email </label>
	                  <input type="text" class="form-control" name="InputEmail" id="InputEmail" placeholder="Email">
	                </div>
	                <div class="form-group">
	                  <label for="InputCompany">Company </label>
	                  <input type="text" class="form-control" name="InputCompany" id="InputCompany" placeholder="Company">
	                </div>
	                <div class="form-group required">
	                  <label for="InputAddress">Address <sup>*</sup> </label>
	                  <input required type="text" class="form-control" name="InputAddress" id="InputAddress" placeholder="Address">
	                </div>
	                <div class="form-group">
	                  <label for="InputAddress2">Address (Line 2) </label>
	                  <input type="text" class="form-control" name="InputAddress2" id="InputAddress2" placeholder="Address">
	                </div>
	                <div class="form-group required">
	                  <label for="InputCity">City <sup>*</sup> </label>
	                  <input required type="text" class="form-control" name="InputCity" id="InputCity" placeholder="City">
	                </div>
	                <div class="form-group required">
	                  <label for="InputState">State <sup>*</sup> </label>
	                  <select class="form-control" required aria-required="true" name="InputState" id="InputState" name="InputState">
	                      <option value="">Choose</option>
	                    <option value="1">Alabama</option>
	                    <option value="2">Alaska</option>
	                    <option value="3">Arizona</option>
	                    <option value="4">Arkansas</option>
	                    <option value="5">California</option>
	                    <option value="6">Colorado</option>
	                    <option value="7">Connecticut</option>
	                    <option value="8">Delaware</option>
	                    <option value="53">District of Columbia</option>
	                    <option value="9">Florida</option>
	                    <option value="10">Georgia</option>
	                    <option value="11">Hawaii</option>
	                    <option value="12">Idaho</option>
	                    <option value="13">Illinois</option>
	                    <option value="14">Indiana</option>
	                    <option value="15">Iowa</option>
	                    <option value="16">Kansas</option>
	                    <option value="17">Kentucky</option>
	                    <option value="18">Louisiana</option>
	                    <option value="19">Maine</option>
	                    <option value="20">Maryland</option>
	                    <option value="21">Massachusetts</option>
	                    <option value="22">Michigan</option>
	                    <option value="23">Minnesota</option>
	                    <option value="24">Mississippi</option>
	                    <option value="25">Missouri</option>
	                    <option value="26">Montana</option>
	                    <option value="27">Nebraska</option>
	                    <option value="28">Nevada</option>
	                    <option value="29">New Hampshire</option>
	                    <option value="30">New Jersey</option>
	                    <option value="31">New Mexico</option>
	                    <option value="32">New York</option>
	                    <option value="33">North Carolina</option>
	                    <option value="34">North Dakota</option>
	                    <option value="35">Ohio</option>
	                    <option value="36">Oklahoma</option>
	                    <option value="37">Oregon</option>
	                    <option value="38">Pennsylvania</option>
	                    <option value="51">Puerto Rico</option>
	                    <option value="39">Rhode Island</option>
	                    <option value="40">South Carolina</option>
	                    <option value="41">South Dakota</option>
	                    <option value="42">Tennessee</option>
	                    <option value="43">Texas</option>
	                    <option value="52">US Virgin Islands</option>
	                    <option value="44">Utah</option>
	                    <option value="45">Vermont</option>
	                    <option value="46">Virginia</option>
	                    <option value="47">Washington</option>
	                    <option value="48">West Virginia</option>
	                    <option value="49">Wisconsin</option>
	                    <option value="50">Wyoming</option>
	                  </select>
	                </div>
	              </div>
	              <div class="col-xs-12 col-sm-6">
	                <div class="form-group required">
	                  <label for="InputZip">Zip / Postal Code <sup>*</sup> </label>
	                  <input required type="text" class="form-control" name="InputZip" id="InputZip" placeholder="Zip / Postal Code">
	                </div>
	                <div class="form-group required">
	                  <label for="InputCountry">Country <sup>*</sup> </label>
	                    <select class="form-control" required aria-required="true" id="InputCountry" name="InputCountry">
	                      <option value="">Choose</option>
	                    <option value="38">Algeria</option>
	                    <option value="39">American Samoa</option>
	                    <option value="40">Andorra</option>
	                    <option value="41">Angola</option>
	                    <option value="42">Anguilla</option>
	                    <option value="43">Antigua and Barbuda</option>
	                    <option value="44">Argentina</option>
	                    <option value="45">Armenia</option>
	                    <option value="46">Aruba</option>
	                    <option value="24">Australia</option>
	                    <option value="2">Austria</option>
	                    <option value="47">Azerbaijan</option>
	                    <option value="48">Bahamas</option>
	                    <option value="49">Bahrain</option>
	                    <option value="50">Bangladesh</option>
	                    <option value="3">Belgium</option>
	                    <option value="34">Bolivia</option>
	                    <option value="4">Canada</option>
	                    <option value="5">China</option>
	                    <option value="16">Czech Republic</option>
	                    <option value="20">Denmark</option>
	                    <option value="7">Finland</option>
	                    <option value="8">France</option>
	                    <option value="1">Germany</option>
	                    <option value="9">Greece</option>
	                    <option value="22">HongKong</option>
	                    <option value="26">Ireland</option>
	                    <option value="29">Israel</option>
	                    <option value="10">Italy</option>
	                    <option value="32">Ivory Coast</option>
	                    <option value="11">Japan</option>
	                    <option value="12">Luxemburg</option>
	                    <option value="35">Mauritius</option>
	                    <option value="13">Netherlands</option>
	                    <option value="27">New Zealand</option>
	                    <option value="31">Nigeria</option>
	                    <option value="23">Norway</option>
	                    <option value="14">Poland</option>
	                    <option value="15">Portugal</option>
	                    <option value="36">Romania</option>
	                    <option value="25">Singapore</option>
	                    <option value="37">Slovakia</option>
	                    <option value="30">South Africa</option>
	                    <option value="28">South Korea</option>
	                    <option value="6">Spain</option>
	                    <option value="18">Sweden</option>
	                    <option value="19">Switzerland</option>
	                    <option value="33">Togo</option>
	                    <option value="17">United Kingdom</option>
	                    <option selected="selected" value="21">United States</option>
	                  </select>
	                </div>
	                <div class="form-group required">
	                  <label for="InputMobile">Mobile phone <sup>*</sup></label>
	                  <input  required type="tel"  name="InputMobile" class="form-control" id="InputMobile">
	                </div>
	              </div>
	            </div>
	            <!-- End Billing Information -->
	            
	            <!-- Begin Payment information -->
	            
	             <div class="row userInfo"  id="creditCardInfoDiv">
	             	<div class="col-lg-12">
		                <h2 class="block-title-2"> Credit Card Information </h2>
		              </div>
	                  <br>
	                  <div class="col-xs-12">
	                    <div class="creditCard">
	                     <div class="paymentInput required">
	                        <label for="InputCCNumber">Credit Card Number <sup>*</sup></label>
	                        <br>
	                        <input id="InputCCNumber" type="text" name="InputCCNumber">
	                      </div>
	                      <!--paymentInput-->
	                      <div class="paymentInput required">
	                        <label for="InputCCOwnerName">Name on Credit Card <sup>*</sup></label>
	                        <br>
	                        <input type="text" name="InputCCOwnerName" id="InputCCOwnerName">
	                      </div>
	                      <!--paymentInput-->
	                      <div class="paymentInput">
	                        <div class="form-group required">
	                          <label>Expiration date <sup>*</sup></label>
	                          <br>
	                          <div class="col-lg-4 col-md-4 col-sm-4 no-margin-left no-padding">
	                            <select required aria-required="true" name="expire" name="InputCCEXPDate" id="InputCCEXPDate">
	                              <option value="">Month</option>
	                              <option value="1">01 - January</option>
	                              <option value="2">02 - February</option>
	                              <option value="3">03 - March</option>
	                              <option value="4">04 - April</option>
	                              <option value="5">05 - May</option>
	                              <option value="6">06 - June</option>
	                              <option value="7">07 - July</option>
	                              <option value="8">08 - August</option>
	                              <option value="9">09 - September</option>
	                              <option value="10">10 - October</option>
	                              <option value="11">11 - November</option>
	                              <option value="12">12 - December</option>
	                            </select>
	                          </div>
	                          <div class="col-lg-4 col-md-4 col-sm-4">
	                            <select required aria-required="true" name="year" name="InputCCEXPYr" id="InputCCEXPYr">
	                              <option value="">Year</option>
	                              <option value="2013">2013</option>
	                              <option value="2014">2014</option>
	                              <option value="2015">2015</option>
	                              <option value="2016">2016</option>
	                              <option value="2017">2017</option>
	                              <option value="2018">2018</option>
	                              <option value="2019">2019</option>
	                              <option value="2020">2020</option>
	                              <option value="2021">2021</option>
	                              <option value="2022">2022</option>
	                              <option value="2023">2023</option>
	                            </select>
	                          </div>
	                        </div>
	                      </div>
	                      <!--paymentInput-->
	                      
	                      <div style="clear:both"></div>
	                      <div class="paymentInput clearfix required">
	                        <label for="InputCCVrCode">Verification Code <sup>*</sup></label>
	                        <br>
	                        <input type="text" id="InputCCVrCode" name="InputCCVrCode" style="width:90px;">
	                        <br>
	                      </div>
	                      <!--paymentInput-->
	                      
	                    </div>
	                    <!--creditCard-->
              </form>
                    <div class="pull-right"> <a onclick="processingOrder()" class="btn btn-primary btn-small " ><i class="fa fa-arrow-left"></i> Order &nbsp; <i class="fa fa-arrow-circle-right"></i> </a> </div>
                  </div>
                </div>
                <!-- End CC info -->
          </div>
          </div>
          <div class="cartFooter w100">
            <div class="box-footer">
              <div class="pull-left"> <a class="btn btn-default" href="index.jsp"> <i class="fa fa-arrow-left"></i> &nbsp; Back to Shop </a> </div>
            </div>
          </div>
          <!--/ cartFooter --> 
          
        </div>
      </div>
      <!--- TODO Populate form session -->
      <div class="col-lg-3 col-md-3 col-sm-12 rightSidebar">
	      <div class="w100 cartMiniTable">
	        <table id="cart-summary" class="std table">
	          <tbody>
	            <tr >
	              <td>Total products</td>
	              <td class="price " id="total-products"></td>
	            </tr>
	            <tr  style="">
	              <td>Shipping</td>
	              <td class="price" ><span class="success">Free shipping!</span></td>
	            </tr>
	            <tr class="cart-total-price ">
	              <td>Total</td>
	              <td class="price totoalPriceCheckout" ></td>
	            </tr>
	            <tr >
	              <td > Total </td>
	              <td class=" site-color " id="total-price"></td>
	            </tr>
	          </tbody>
	          <tbody>
	          </tbody>
	        </table>
	      </div>
	      <!--  /cartMiniTable--> 
	      
	    </div>
    <!--/rightSidebar--> 
    </div>
  </div> 
  
  <div style="clear:both"></div>
</div>
<!-- /.main-container-->
<div class="gap"> </div>


<!-- Add Footer here if needed -->
<!-- Le javascript
================================================== --> 

<!-- Placed at the end of the document so the pages load faster --> 
<script type="text/javascript" src="assets/js/jquery/1.8.3/jquery.js"></script> 
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.2.0/bootbox.min.js"></script> 

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
<script src="assets/js/jquery.minimalect.min.js"> </script> 

<!-- include touchspin.js // touch friendly input spinner component   --> 
<script src="assets/js/bootstrap.touchspin.js"></script> 

<!-- include custom script for site  --> 
<script src="assets/js/script.js"></script>

<!-- Order Processing Scripts 
<script  type="text/javascript" src="assets/js/cdStoreOrderPrcessing.js"></script>
-->
<script src="assets/js/fall14Mongo.js"></script>
<script src="assets/js/util.js"></script>
<script src="assets/js/OrderProcessingfall14Mongo.js"></script>
</body>
</html>
