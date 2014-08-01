<%@ taglib prefix="l" uri="/jodd-lagarto" %>
<html>
<body>

<h1>Survey LAST page</h1>

<l:form>
<form method="POST" action="stepThree.save">
	Your name: ${survey.name}. <br>
	Age: ${survey.age}

	<br>
	How many projects with Jodd: ${survey.projectsCount}. <br>
	One project name: ${survey.projectName}
	<br>

	<input type="checkbox" name="survey.likeJodd"> I love Jodd <br>
	<textarea name="survey.comment" cols="30" rows="10"></textarea>

	<br>
	<button name="back" value="true">Back to page #2</button>
	<button>Save and exit</button>
</form>
</l:form>


</body>

</html>