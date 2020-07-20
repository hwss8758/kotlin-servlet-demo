package me.wonsang

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @Autowired
    lateinit var helloService: HelloService

    @GetMapping("/hello")
    @ResponseBody
    fun hello(): String = "Hello, " + helloService.getName()

    @GetMapping("/sample")
    fun sample(): String = "sample"
}