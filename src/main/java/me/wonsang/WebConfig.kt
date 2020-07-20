package me.wonsang

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.view.InternalResourceViewResolver

@Configuration
@ComponentScan
open class WebConfig {

    @Bean
    open fun viewResolver(): ViewResolver {
        val viewResolver = InternalResourceViewResolver()
        viewResolver.setPrefix("/WEB-INF/")
        viewResolver.setSuffix(".jsp")
        return viewResolver
    }
}