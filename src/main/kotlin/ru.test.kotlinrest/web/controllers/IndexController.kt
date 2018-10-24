package ru.test.kotlinrest.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {

    @RequestMapping(
            value = ["/"],
            method = [RequestMethod.GET]
    )
    @ResponseBody
    fun getIndex(): String =
            "Hello index"

}