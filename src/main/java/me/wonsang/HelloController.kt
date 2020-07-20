package me.wonsang

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Autowired
    lateinit var helloService: HelloService

    @GetMapping("/hello")
    fun hello(): String = "Hello, " + helloService.getName()
}