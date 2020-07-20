package me.wonsang

import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.mvc.Controller
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@org.springframework.stereotype.Controller("/simple")
class SimpleController : Controller {
    override fun handleRequest(p0: HttpServletRequest, p1: HttpServletResponse): ModelAndView? {
        return ModelAndView("/WEB-INF/simple.jsp")
    }
}