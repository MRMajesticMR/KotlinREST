package ru.test.kotlinrest.model.quotes.mappers

import ru.test.kotlinrest.api.objects.QuoteApiObject
import ru.test.kotlinrest.base.Mapper
import ru.test.kotlinrest.model.quotes.Quote

class QuoteToApiObjectMappers : Mapper<Quote, QuoteApiObject> {

    override fun map(from: Quote): QuoteApiObject =
            QuoteApiObject(
                    id = from.id,
                    author = from.author.takeIf { it.isNotEmpty() },
                    text = from.text.takeIf { it.isNotEmpty() }
            )

}