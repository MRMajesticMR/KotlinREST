package ru.test.kotlinrest.models.quotes.repository

import ru.test.kotlinrest.models.data.Quote

interface QuotesRepository {

    /**
     * Fetch all Quotes
     */
    fun all(): List<Quote>

}