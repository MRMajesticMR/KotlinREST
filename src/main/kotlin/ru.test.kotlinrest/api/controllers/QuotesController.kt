package ru.test.kotlinrest.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import ru.test.kotlinrest.api.objects.QuoteApiObject
import ru.test.kotlinrest.base.Mapper
import ru.test.kotlinrest.models.data.Quote
import ru.test.kotlinrest.models.quotes.repository.QuotesRepository

@RestController
class QuotesController {

    @Autowired
    private lateinit var quotesRepository: QuotesRepository

    @Autowired
    private lateinit var quoteToApiObjectMappers: Mapper<Quote, QuoteApiObject>

    /**
     * Controller for GET /quotes
     */
    @RequestMapping(
            path = ["/quotes"],
            method = [RequestMethod.GET],
            produces = [MediaType.APPLICATION_JSON_UTF8_VALUE],
            consumes = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun getQuotes(): ResponseEntity<List<QuoteApiObject>> =
            ResponseEntity.ok(quotesRepository.all().map(quoteToApiObjectMappers::map))

}