# Jodd Quickstart

Jodd examples, ready to be re-used!

Download the project, setup and run. Then examine the code;
check `todo` markers for more hints.

Read more: https://jodd.org/quickstart/

## madvoc

Web application built using only [Madvoc](http://jodd.org/madvoc) web framework and default configuration settings. Actions are annotated. Uses [Lagarto](http://jodd.org/lagarto) Form tag.

Run [the web app](http://localhost:8080/madvoc) with:

	./gradlew :madvoc:jettyRun

## madvoc2

This is a simple example for [Madvoc](http://jodd.org/madvoc) using Servlets 3.x declarative way for registering components (and not using `web.xml`).

Run [the web app](http://localhost:8080/madvoc2) with:

	./gradlew :madvoc2:jettyRun


## madvoc-petite

This example enables [Petite](http://jodd.org/petite) with [Madvoc](http://jodd.org/petite).

Run [the web app](http://localhost:8080/madvoc-petite) with:

	./gradlew :madvoc-petite:jettyRun


## httpclient

Example of Jodd [Http](http://jodd.org/http) client.


	./gradlew :httpclient:run


## webapp1

More advanced example of [web application](http://localhost:8080/webapp1) built with [Jodd Joy](http://jodd.org/joy).
Application reads users from database (using [DbOom](http://jodd.org/db)) and displays
them on the page (using [Madvoc](http://jodd.org/madvoc)), decorated by [Decora](http://jodd.org/decora). Services and actions are wired with [Petite](http://jodd.org/decora).

MySql database required for this example, see provided `docker-compose`.

	cd webapp1
	docker-compose up
	cd ..
	./gradlew :webapp1:jettyRun











--



### webapp 2

This example is similar to first one, but it does not use the database.
The important difference is that **Madvoc** is being setup
using _routes_ file and not automatically. **Petite** beans, however
are still loaded by scanning the class path.

[webapp2 README](webapp2/README.md)


### OSGi

Simple example of using *Jodd* bundles inside OSGi environment.

[osgi README](osgi/README.md)

### gapps

If you plan to use **Madvoc** for Google AppEngine,
just take this quickstart example. It contains significant
configuration change that enables running your web app
locally.

[gapps README](gapps/README.md)
