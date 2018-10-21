package ru.test.kotlinrest.model.quotes.mappers

import org.springframework.stereotype.Component
import ru.test.kotlinrest.api.objects.QuoteApiObject
import ru.test.kotlinrest.base.Mapper
import ru.test.kotlinrest.model.quotes.Quote

@Component
open class QuoteToApiObjectMappers : Mapper<Quote, QuoteApiObject> {

    override fun map(from: Quote): QuoteApiObject =
            QuoteApiObject(
                    id = from.id,
                    author = from.author.takeIf { it.isNotEmpty() },
                    text = from.text.takeIf { it.isNotEmpty() },
                    creationDate = from.creationDate.toDate()
            )

}