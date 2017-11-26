# Jodd Quickstart

Jodd examples, ready to be re-used!

Download the project, setup and run. Then examine the code;
check `todo` markers for more hints.

Read more: https://jodd.org/quickstart/

## madvoc

Web application built using only [Madvoc](http://jodd.org/madvoc) web framework and default configuration settings. Actions are annotated.

Run [the web app](http://localhost:8080/madvoc) with:

	./gradlew :madvoc:jettyRun

## madvoc2

This is a simple example for [Madvoc](http://jodd.org/madvoc) using the Servlets 3.x declarative way for registering components (and not using `web.xml`).

Run [the web app](http://localhost:8080/madvoc2) with:

	./gradlew :madvoc2:jettyRun

### gapps

If you plan to use **Madvoc** for Google AppEngine,
just take this quickstart example. It contains significant
configuration change that enables running your web app
locally.

[gapps README](gapps/README.md)


### webapp 1

More advanced example of web application built with many **Jodd*** frameworks.
MySql database required for this example (SQL script provided).
Application reads users from database (using **DbOom**) and displays
them on the page (using **Madvoc**), decorated by **Decora**.
Services and actions are wired with **Petite**. This example also
uses benefits of **Jodd Joy**!

[webapp1 README](webapp1/README.md)


### webapp 2

This example is similar to first one, but it does not use the database.
The important difference is that **Madvoc** is being setup
using _routes_ file and not automatically. **Petite** beans, however
are still loaded by scanning the class path.

[webapp2 README](webapp2/README.md)


### OSGi

Simple example of using *Jodd* bundles inside OSGi environment.

[osgi README](osgi/README.md)


### HTTP Client

Simple example of *Jodd* http client.
