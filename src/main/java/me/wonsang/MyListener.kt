package me.wonsang

import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener

class MyListener : ServletContextListener {
    override fun contextInitialized(sce: ServletContextEvent?) {
        println("ServletContextListener Context Initialized")
        sce?.servletContext?.setAttribute("name", "wonsang")
    }

    override fun contextDestroyed(sce: ServletContextEvent?) {
        println("ServletContextListener Context Destroyed")
    }
}