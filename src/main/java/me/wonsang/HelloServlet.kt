package me.wonsang

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class HelloServlet : HttpServlet() {

    override fun init() {
        println("HelloServlet init")
    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("HelloServlet doGet")
        resp?.writer?.println("<html>")
        resp?.writer?.println("<head>")
        resp?.writer?.println("<body>")
        resp?.writer?.println("<h1>Hello, " + getName() + "</h1>")
        resp?.writer?.println("</body>")
        resp?.writer?.println("</head>")
        resp?.writer?.println("</html>")
    }

    private fun getName() = servletContext.getAttribute("name")

    override fun destroy() {
        println("HelloServlet destroy")
    }
}