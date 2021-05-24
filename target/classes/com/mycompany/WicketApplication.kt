package com.mycompany

import org.apache.wicket.protocol.http.WebApplication
import org.apache.wicket.markup.html.WebPage
import com.mycompany.HomePage
import org.apache.wicket.csp.CSPDirective
import org.apache.wicket.csp.CSPDirectiveSrcValue

class WicketApplication : WebApplication() {

    override fun getHomePage(): Class<out WebPage?> {
        return HomePage::class.java
    }

    public override fun init() {
        super.init()
        cspSettings.blocking()
            .add(CSPDirective.STYLE_SRC, CSPDirectiveSrcValue.SELF)
            .add(CSPDirective.STYLE_SRC, "https://fonts.googleapis.com/css")
            .add(CSPDirective.FONT_SRC, "https://fonts.gstatic.com")
    }

}