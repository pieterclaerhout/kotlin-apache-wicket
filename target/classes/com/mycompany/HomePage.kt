package com.mycompany

import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.markup.html.basic.Label

class HomePage(parameters: PageParameters?) : WebPage(parameters) {

    companion object {
        private const val serialVersionUID = 1L
    }

    init {
        add(Label("version", application.frameworkSettings.version))
    }

}
