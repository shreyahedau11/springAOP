<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/JavaScript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js" ></script>
<title>Insert title here</title>

</head>
<body>
 <h1>welcome12</h1>


 <script type="text/javascript">
 $(document).ready(function() {
 alert("hi");
 	$.ajax({
 		url: "http://localhost:9098/greeting"
 	}).then(function(data) {
 	  alert("hi");
 	});
 });
 </script>
</body>
</html>