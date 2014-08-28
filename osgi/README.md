# Jodd Quickstart: OSGi

See how **Jodd** can be used in OSGi environment.

You have the following modules:

## Provider

This OSGi bundle provides some services. Just an example bundle,
not related to **Jodd**.

## Consumer

Dummy OSGi bundle with only one `Activator`. It consumes the `provider` bundle
and the **Jodd** bundles. Also shows how to initialize **Jodd**.
Read more in the documentation.

## Client

This is command line client that starts Apache Felix and runs bundles.
Just for completeness.
