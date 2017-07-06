Grails URL Rewrite Plugin
=========================

# Intro

[Grails][1] integration for [Url-Rewrite][2].


# Setup

1. Add the plugin to your project's `grails-app/conf/BuildConfig.groovy`:

	compile ":url-rewrite:1.0"

2. Add a [urlrewrite.xml][3] file to `web-app/WEB-INF/`


# Configuration

Further configuration of urlrewrite.xml can be done [as per the urlrewrite documentation][4].


# tasks

	TODO                | in progress                | DONE
	                                                   inject the url rewrite rules at the top of web.xml

# The future?

Could add a groovy DSL for defining rewrite rules... but seems a bit pointless.


[1]: http://grails.org
[2]: http://www.tuckey.org/urlrewrite
[3]: http://urlrewritefilter.googlecode.com/svn/trunk/src/doc/manual/4.0/urlrewrite.xml
[4]: http://urlrewritefilter.googlecode.com/svn/trunk/src/doc/manual/4.0/index.html

