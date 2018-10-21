package ru.test.kotlinrest.api.objects

import java.util.*

data class QuoteApiObject(
        val id: Long?,
        val author: String?,
        val text: String?,
        val creationDate: Date?
)