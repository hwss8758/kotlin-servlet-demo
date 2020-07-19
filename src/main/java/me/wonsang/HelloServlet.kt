package me.wonsang

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class HelloServlet : HttpServlet() {

    override fun init() {
        println("init")
    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("doGet")
        resp?.writer?.println("<html>")
        resp?.writer?.println("<head>")
        resp?.writer?.println("<body>")
        resp?.writer?.println("<h1>Hello Servlet</h1>")
        resp?.writer?.println("</body>")
        resp?.writer?.println("</head>")
        resp?.writer?.println("</html>")
    }

    override fun destroy() {
        println("destroy")
    }
}