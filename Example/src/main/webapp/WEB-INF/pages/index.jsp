<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<spring:url value="/resources/xxxxx.js" var="mainJs" />
	<script src="${mainJs}" type="text/javascript"></script>

  
</head>
<body>
<h1>Maven + Spring MVC Web Project Example</h1>

<h2>Message : ${message}</h2>
<h2>Counter : ${counter}</h2>
<input type="text" id="name"></input>
<input type="text" id="lastname"></input>
<input type="button" id ="btn" name="submit" value="Submit"  /> 
</body>
</html>