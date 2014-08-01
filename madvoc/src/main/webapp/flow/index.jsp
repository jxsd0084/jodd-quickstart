<%@ taglib prefix="l" uri="/jodd-lagarto" %>
<html>
<body>

<h1>Welcome to Survey!</h1>

<l:form>
<form method="POST" action="index.save">
	Your name:
	<input type="text" name="survey.name">
	<br>
	Age:
	<input type="text" name="survey.age">
	<br>

	<button>Continue to page #2</button>

</form>
</l:form>


</body>

</html>