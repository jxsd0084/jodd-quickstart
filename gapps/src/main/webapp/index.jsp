<html>
<head>
	<title>Jodd @ AppEngine</title>
	<style>
h1 {
	text-align: center;
	font-family: monospace;
	font-size: 30px;
	color: #666;
}
.pill {
	text-align: center;
	border-radius: 10px;
	border: 10px solid #ddd;
}
.pill a {
	font-family: Georgia, "Times New Roman", Times, serif;
	font-size: 120px;
	font-weight: bold;
	padding: 80px;
	display: block;
}

#box {
	width: 70%;
	margin: 0 auto;
	overflow: auto;
}

#pill-l {
	float: left;
	width: 45%;
	overflow: auto;
	background-color: crimson;
}
#pill-r {
	float: right;
	width: 45%;
	overflow: auto;
	background-color: darkblue;
}
a, a:visited {
	color: white;
	text-decoration: none;
}
a:hover {
	color: yellow;
}

	</style>
</head>
<body>

<h1>Choose the pill!</h1>

<div id="box">
<div id="pill-l" class="pill"><a href="index.click?color=blue">${b}</a></div>
<div id="pill-r" class="pill"><a href="index.click?color=red">${r}</a></div>
</div>

</body>
</html>