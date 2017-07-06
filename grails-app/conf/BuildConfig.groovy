grails.project.work.dir = 'target'
grails.project.source.level = 1.6

grails.project.dependency.resolution = {
	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'org.tuckey:urlrewritefilter:4.0.3'
	}

	plugins {
		build(':release:3.0.1', ':rest-client-builder:2.0.3') {
			export = false
		}
	}
}

