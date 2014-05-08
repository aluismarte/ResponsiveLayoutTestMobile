class UrlMappings {

	static mappings = {
        "/"(controller: 'app', action: 'index')

        //habilitar los controladores con Vaadin y Grails.
        "/restful/$action?"(controller: "app" )
	}
}
