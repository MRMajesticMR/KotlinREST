package ru.test.kotlinrest.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import kotlinx.html.*
import kotlinx.html.stream.createHTML
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {

    @RequestMapping(
            value = ["/"],
            method = [RequestMethod.GET]
    )
    @ResponseBody
    fun getIndex(): String =
            createHTML(prettyPrint = true)
                    .html {
                        head {
                            title {
                                +"Hello Kotlin"
                            }
                        }
                        body {
                            h1 {
                                +"Hello world"
                            }
                        }
                    }

}