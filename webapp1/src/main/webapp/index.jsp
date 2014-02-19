<%@ taglib prefix="j" uri="/jodd" %>
<html>
<head>
</head>
<body>

<img src="jodd-badge.png" align="left"/>
<h1>Hello Jodd!</h1>

<h2>Jodders love the following books:</h2>
<ul>
<j:iter items="${books}" var="book">
	<li>${book.id}) ${book.name} by ${book.author}</li>
</j:iter>
</ul>

</body>
</html>