package ru.test.kotlinrest.models.quotes.mappers

import org.springframework.stereotype.Component
import ru.test.kotlinrest.api.objects.QuoteApiObject
import ru.test.kotlinrest.base.Mapper
import ru.test.kotlinrest.models.data.Quote

@Component
open class QuoteToApiObjectMappers : Mapper<Quote, QuoteApiObject> {

    override fun map(from: Quote): QuoteApiObject =
            QuoteApiObject(
                    id = from.id,
                    text = from.text?.takeIf { it.isNotEmpty() }
            )

}