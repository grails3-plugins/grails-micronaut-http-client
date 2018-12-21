package org.grails.plugins.micronaut.httpclient

import grails.plugins.Plugin
import grails.plugins.metadata.PluginSource
import groovy.transform.CompileStatic

@PluginSource
@CompileStatic
class MicronautHttpClientGrailsPlugin extends Plugin {

    def grailsVersion = "4.0.0.BUILD-SNAPSHOT > *"

    def pluginExcludes = []

    def title = "Geb Plugin" 
    def author = "Sergio del Amo"
    def authorEmail = "sergio.delamo@softamo.com"
    def description = '''\
Plugin that adds Micronaut HTTP Client rest api testing code generation features.
'''

    def documentation = "https://github.com/grails3-plugins/grails-micronaut-http-client"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    def issueManagement = [ system: "Github Issues", url: "https://github.com/grails3-plugins/grails-micronaut-http-client/issues" ]

    def scm = [ url: "https://github.com/grails3-plugins/grails-micronaut-http-client" ]
}
