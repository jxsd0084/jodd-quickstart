<%@ taglib prefix="j" uri="/jodd" %>
<html>
<head>
</head>
<body>

<img src="jodd-badge.png" align="left"/>
<h1>Hello Jodd!</h1>

<h2>Jodders are:</h2>
<ul>
<j:iter items="${users}" var="user">
	<li>${user.id}) ${user.name}</li>
</j:iter>
</ul>

</body>
</html>