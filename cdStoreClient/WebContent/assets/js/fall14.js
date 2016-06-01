/**
 * 
 * 
 */
$(function(){
	$.ajax({
		async :	true, 
		url   : '//localhost:8080/CDOrderProcessing/CatalogService/CategoryService/getList',
		type  : 'get',
		data  : {},
		dataType : 'json'
}).done(function(data){
	if(data){
		$.each(data, function() {
			$.each(this,function(key,value){
				if(key == 'name'){
					$('#categoryUl').append('<li ><a class="cat" data-category="'+value+'"><strong>'+value+'</strong></a></li>');	
				}
			});
			
		});
		$(".cat").on('click',function(){
	  		//alert($(this).data('category'));
	  		cd.retrive($(this).data('category'));	
	  	});
		$('.cat').css('textTransform', 'capitalize');
		
	}
	else{
		alert('unknown error');
	}
});
	cd.retrive('pop');
	cart.display();
});
var cd = {};
cd.retrive = function(categoryName){
	//alert('cd.retrive');
	$('#productslider').html("");
	$.ajax({
		async :	false, 
		url   : '//localhost:8080/CDOrderProcessing/CatalogService/CdService/getListByCategoryName/'+categoryName,
		type  : 'get',
		data  : {},
		dataType : 'json'
}).done(function(data){
	if(data){
		$.each(data, function() {
			var title, artist, year, price;
			//alert(this.title);
			var content = '<div class="item"><div class="product"><div class="image"><a href="product-details.html"><img src="images/product/'+this.title.replace(/\s/g, '')+'.jpg" alt="img" class="img-responsive"></a></div><div class="description"><h4><a href="product-details.html">'+this.title+'</a></h4><p>'+this.artist+'</p><span class="size">'+this.year+'</span> </div><div class="price"><span>'+this.price+'</span> </div><div class="action-control"><a class="btn btn-primary addToCart" data-id="'+this.id+'"> <span class="add2cart"><i class="glyphicon glyphicon-shopping-cart"></i> Add to cart </span> </a> </div></div></div>';
			console.log(content);
			$('#productslider').append(content);
	});
		$(".addToCart").on('click',function(){
	  		cart.add($(this).data('id'));	
	  	});
		cart.display();
		
	}
	else{
		alert('unknown error');
	}
});
}
var cart = {};

cart.add = function(id){
	$.ajax({
		async :	false, 
		url   : 'ShopCart?method=add&id='+id,
		type  : 'get',
		data  : {},
		dataType : 'json'
		}).done(function(data){
		if(data.result){
			bootbox.alert('Item added in your cart.');
			cart.display();
			
			
		}
		else{
			bootbox.alert('Item Out of Stock');
			cart.display();
		}
	});
}

cart.display = function(){
//	alert('display');
	$.ajax({
		async :	false, 
		url   : 'ShopCart?method=get',
		type  : 'get',
		data  : {},
		dataType : 'json'
		}).done(function(data){
			//console.log("data = "+data);
			if(data){
				totalItems = 0;
				$('.cartBody').html("");
				$('.navCart').html("");
				$.each(data.cds,function(){
					totalItems++;
					var content = '<tr class="miniCartProduct"><td style="width:20%" class="miniCartProductThumb"><div> <a href="#" class="productDetail" data-id=""> <img src="images/product/'+this.title.replace(/\s/g, '')+'.jpg" alt="img"> </a> </div></td><td  style="width:40%"><div class="miniCartDescription"><h4> <a href="#">'+this.title+'</a> </h4><span class="size"></span><div class="price"> <span> $'+ this.price +' </span> </div></div></td><td   style="width:10%" class="miniCartQuantity"><a > X '+this.quantity+' </a></td><td  style="width:15%" class="miniCartSubtotal"><span> $'+this.subTotal+' </span></td><td  style="width:5%" class="deleteCartItem" data-id="'+this.id+'"><a > <i class="fa fa-trash"></i> </a></td></tr>';
					$('.cartBody').append(content);
					$('.navCart').append(content);
				});
				$('.deleteCartItem').on('click',function(){
					cart.deleteItem($(this).data('id'));
				});
				$('.subtotal').html('Total : $'+data.total.toFixed(2));
				$('.totalTop').html('($'+data.total.toFixed(2)+')');
				$('#total-price').html('$' + data.total.toFixed(2));
				$('#total-products').html(totalItems);
				
			}
			else{
				//bootbox.alert('Item Out of Stock');
			}
	});
	
}
//Delete Cart Item
cart.deleteItem = function(id){
	bootbox.confirm("Are you sure you want to remove this item ?", function(result) {
		if(result){
			$.ajax({
				async :	true, 
				url   : 'ShopCart?method=delete&id='+id,
				type  : 'get',
				data  : {},
				dataType : 'json'
				}).done(function(data){
				if(data.result){
					bootbox.alert('Item successfully removed from your cart.');
					cart.display();
				}
				else{
					bootbox.alert('Error removing');
					cart.display();
				}
			});
		}
	}); 
	
	
}
var member = {};
member.login = function(formElm){
	$.ajax({
		async :	false, 
		url   : 'LoginController?'+$(formElm).serialize(),
		type  : 'post',
		data  : {},
		dataType : 'json'
		}).done(function(data){
			//console.log("data = "+data);
			if(data){
				console.log("data = "+data);
			}
			else{
				//bootbox.alert('Item Out of Stock');
			}
	});
	
	var member = {};
	member.register = function(formElm){
		$.ajax({
			async :	false, 
			url   : 'RegisterController?'+$(formElm).serialize(),
			type  : 'post',
			data  : {},
			dataType : 'json'
			}).done(function(data){
				//console.log("data = "+data);
				if(data){
					console.log("data = "+data);
				}
				else{
					//bootbox.alert('Item Out of Stock');
				}
		});
}
}