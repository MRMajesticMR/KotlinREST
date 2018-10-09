package ru.test.kotlinrest.test

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class TestRestController {

    data class TestResponse(
            val text: String
    )

    @RequestMapping(
            path = ["/test"],
            method = [RequestMethod.GET],
            produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun getTest(): Any =
            TestResponse(
                    text = "Hello world"
            )

}