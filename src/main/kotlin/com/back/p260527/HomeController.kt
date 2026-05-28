package com.back.p260527

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

class HomeController {

    @RestController
    class HomeController {

        @GetMapping("/")
        fun main(): String {
            return "Hi, Spring Boot!!"
        }
    }
}