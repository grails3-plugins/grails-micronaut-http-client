description("Creates a REST API Functional Test") {
    usage "grails create-http-test [TEST NAME]"
    argument name:'Test Name', description:"The name of the test"
	completer AllClassCompleter
}

model = model( args[0] )
render	template:"HttpSpec.groovy",
		destination: file( "src/integration-test/groovy/$model.packagePath/${model.simpleName}Spec.groovy"),
		model: model