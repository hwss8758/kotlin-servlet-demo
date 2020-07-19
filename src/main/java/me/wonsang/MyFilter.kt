package me.wonsang

import javax.servlet.*

class MyFilter : Filter {
    override fun destroy() {
        println("Filter Destroy")
    }

    override fun doFilter(request: ServletRequest?,
                          response: ServletResponse?,
                          chain: FilterChain?) {
        println("doFilter")
        chain?.doFilter(request, response)
    }

    override fun init(filterConfig: FilterConfig?) {
        println("Filter Init")
    }
}