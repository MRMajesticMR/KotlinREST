package ru.test.kotlinrest.model.quotes

import org.joda.time.LocalDateTime

class Quote(
        val id: Long,
        val author: String,
        val text: String,
        val creationDate: LocalDateTime
)