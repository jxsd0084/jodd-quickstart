<%@ taglib prefix="l" uri="/jodd-lagarto" %>
<html>
<body>

<h1>Survey page #2</h1>

<l:form>
<form method="POST" action="stepTwo.save">
	Your name: ${survey.name}. <br>
	Age: ${survey.age}

	<br>
	How many projects with Jodd:
	<input name="survey.projectsCount" type="text">

	<br>

	One project name:
	<input name="survey.projectName" type="text">

	<br>

	<button name="back" value="true">Back to page #1</button>
	<button>Continue to last page</button>
</form>
</l:form>


</body>

</html>