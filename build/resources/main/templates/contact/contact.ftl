<!DOCTYPE HTML>
<html>
<head>
<title>Home</title>
<link href="/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary JavaScript plugins) -->
<script src="/js/jquery.min.js"></script>
<!-- Custom Theme files -->
 <link href="/css/dashboard.css" rel="stylesheet">
<link href="/css/style.css" rel='stylesheet' type='text/css' />

<!-- Custom Theme files -->
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Curriculum Vitae Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href='http://fonts.useso.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
<!-- start menu -->
  
</head>
<body>
<!-- header -->
<div class="col-sm-3 col-md-2 sidebar">
		 <div class="sidebar_top">
			 <h1>USER NAME</h1> 
			 <img src="images/avt.png" alt=""/>
		 </div>
		<div class="details">
			 <h3>PHONE</h3>
			 <p>+00 234 56 789</p>  	 
			 <h3>EMAIL</h3>
			 <p><a href="mailto@example.com">mail@example.com</a></p>
			 <address>
			 <h3>ADDRESS</h3>
			 <span>Lorem ipsum,</span>
			 <span>Sed dolor sit,</span>
			 <span>Praesent porta.</span>
			 </address>
			 
		</div>
		<div class="clearfix"></div>
</div>
<!---->
<link href="/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<script src="/js/jquery.magnific-popup.js" type="text/javascript"></script>
	<!---//pop-up-box---->			
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	 <div class="content">
		 <div class="details_header">
			 <ul>
				 <li><a href="/"><span class="glyphicon glyphicon-file" aria-hidden="true"></span>Resume</a></li>
				 <li><a href="#"><span class="glyphicon glyphicon-print" aria-hidden="true"></span>Print CV</a></li>
				 <li><a href="#"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>Email me</a></li>
				 <li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><span class="glyphicon glyphicon-picture" aria-hidden="true"></span>View photo</a></li>
				 <div id="small-dialog" class="mfp-hide">
					 <img src="/images/g4.jpg" alt=""/>
				 </div>
				 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>
			 </ul>
		 </div>
		 <div class="company contact-grid">
			 <h3 class="clr1">Contact</h3>
			 <form action="/sendemail">
					<input type="text" value="Name" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='Name';}">					
					<input type="text" value="Email" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='Email';}">
					<input type="text" value="Subject" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='Subject';}">						
					<textarea cols="77" rows="6" value=" " onfocus="this.value='';" onblur="if (this.value == '') {this.value = 'Message';}">Message</textarea>
					<div class="send">
						<input type="submit" value="Send" >
					</div>
			 </form>
		 </div>
	 </div>
</div>
<!---->
</body>
</html>