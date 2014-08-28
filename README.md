Jodd Quickstart
===============

Jodd QuickStart templates.

Download project, setup and run. Then examine the code;
check `todo` markers for more hints.

Read more: http://jodd.org/doc/quickstart


## Quickstarts

The list of available Jodd QuickStart template projects:


### madvoc

This is a quick start web application built using
**Madvoc** web framework. **Madvoc** is MVC framework that
uses CoC and annotations in a pragmatic way to simplify
web application development. It is easy to use,
learning curve is small and it is easy to extend.
There are no external (xml) configuration, actions
are simple POJOs, it is compatible with any view
technology, its pluggable and so on...

[madvoc README](madvoc/README.md)


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
