
Jodd Quickstart: Webapp 1
=========================

Experience several micro frameworks, such as:
[Madvoc](http://jodd.org/doc/madvoc/index.html),
[Petite](http://jodd.org/doc/petite/index.html),
[Decora](http://jodd.org/doc/decora/index.html),
[DbOom](http://jodd.org/doc/db/index.html)
and more in this simple QuickStart web application!

## Build war

Clone this github repo. Invoke:

	gradlew clean
	gradlew war

This will build the whole project and prepare the war file.


## Create database

One time only, you need to create MySql database: `jodd-quickstart`
using script `etc/mysql.sql`. Change database JDBC parameters
in `src/main/resources/app.props`.


## Run web app

Run war with:

	gradlew jettyRun

After few moments, you can see example on: [http://localhost:8080/webapp1]().
Press `Control+C` to quit web application.

Enjoy!
