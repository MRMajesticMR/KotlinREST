package ru.test.kotlinrest.api.controllers

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import ru.test.kotlinrest.api.objects.QuoteApiObject
import ru.test.kotlinrest.base.Mapper
import ru.test.kotlinrest.model.quotes.Quote
import ru.test.kotlinrest.model.quotes.QuotesRepository
import ru.test.kotlinrest.model.quotes.QuotesRepositoryMockImpl
import ru.test.kotlinrest.model.quotes.mappers.QuoteToApiObjectMappers

@RestController
class QuotesController {

    private val quotesRepository: QuotesRepository = QuotesRepositoryMockImpl()

    private val quoteToApiObjectMappers: Mapper<Quote, QuoteApiObject> = QuoteToApiObjectMappers()

    /**
     * Controller for GET /quotes
     */
    @RequestMapping(
            path = ["/quotes"],
            method = [RequestMethod.GET],
            produces = [MediaType.APPLICATION_JSON_UTF8_VALUE],
            consumes = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun getQuotes(): ResponseEntity<List<QuoteApiObject>> =
            ResponseEntity.ok(quotesRepository.getAll().map(quoteToApiObjectMappers::map))

}