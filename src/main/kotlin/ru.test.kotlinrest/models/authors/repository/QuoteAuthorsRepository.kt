package ru.test.kotlinrest.models.authors.repository

import ru.test.kotlinrest.models.data.QuoteAuthor

interface QuoteAuthorsRepository {

    /**
     * Get list of all Author of Quotes
     */
    fun all(): List<QuoteAuthor>

}