class UrlRewriteGrailsPlugin {
	def version = '1.0'
	def grailsVersion = "2.3 > *"
	def title = "URL Rewrite Plugin"
	def author = "Alex Anderson"
	def authorEmail = ""
	def description = 'Integration with tuckey\'s URL Rewrite plugin'
	def documentation = "http://github.com/alxndrsn/grails-url-rewrite-plugin"
	def license = "APACHE"
	def issueManagement = [system: "Github", url: "https://github.com/alxndrsn/grails-url-rewrite-plugin/issues"]
	def scm = [url: "https://github.com/alxndrsn/grails-url-rewrite-plugin"]

	def loadAfter = ['spring-security-core', 'resources']
	def doWithWebDescriptor = { webxml ->
		webxml.'context-param'[-1] + {
			filter {
				'filter-name' 'UrlRewriteFilter'
				'filter-class' 'org.tuckey.web.filters.urlrewrite.UrlRewriteFilter'
			}
		}
		webxml.'context-param'[-1] + {
			'filter-mapping' {
				'filter-name' 'UrlRewriteFilter'
				'url-pattern' '/*'
				dispatcher 'REQUEST'
				dispatcher 'FORWARD'
			}
		}
	}
}

