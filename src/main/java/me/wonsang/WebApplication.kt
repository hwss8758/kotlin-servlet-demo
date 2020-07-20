package me.wonsang

import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet
import javax.servlet.ServletContext

class WebApplication : WebApplicationInitializer {
    override fun onStartup(p0: ServletContext) {
        val context = AnnotationConfigWebApplicationContext()
        context.register(WebConfig::class.java)
        context.refresh()

        val dispatcherServlet = DispatcherServlet(context)
        val app = p0.addServlet("app", dispatcherServlet)
        app.addMapping("/app/*")

    }
}