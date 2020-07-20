package me.wonsang

import org.springframework.context.ApplicationContext
import org.springframework.web.context.WebApplicationContext
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class HelloServlet : HttpServlet() {

    override fun init() {
        println("HelloServlet:HttpServlet init")
    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {

        println("HelloServlet:HttpServlet doGet")

        val context: ApplicationContext =
                servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE) as ApplicationContext

        val helloService = context.getBean(HelloService::class.java)

        resp?.writer?.println("<html>")
        resp?.writer?.println("<head>")
        resp?.writer?.println("<body>")
        resp?.writer?.println("<h1>Hello, " + helloService.getName() + "</h1>")
        resp?.writer?.println("</body>")
        resp?.writer?.println("</head>")
        resp?.writer?.println("</html>")
    }

    private fun getName() = servletContext.getAttribute("name")

    override fun destroy() {
        println("HelloServlet:HttpServlet destroy")
    }
}