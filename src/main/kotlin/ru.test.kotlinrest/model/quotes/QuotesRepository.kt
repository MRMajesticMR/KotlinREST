package ru.test.kotlinrest.model.quotes

import org.joda.time.LocalDateTime
import org.springframework.stereotype.Repository

interface QuotesRepository {

    fun getAll(): List<Quote>

}

@Repository
open class QuotesRepositoryMockImpl: QuotesRepository {

    override fun getAll(): List<Quote> =
            listOf(
                    Quote(
                            id = 1,
                            author = "Молев",
                            text = "С мудаками надо говорить по мудаццки",
                            creationDate = LocalDateTime.now()
                    ),
                    Quote(
                            id = 2,
                            author = "Смольянинов",
                            text = "Героям слава!  Слава нації! Смерть ворогам! Україна - понад усе!",
                            creationDate = LocalDateTime.now().minusDays(1)
                    ),
                    Quote(
                            id = 3,
                            author = "Бухал",
                            text = "Меньше пизди, больше делай!",
                            creationDate = LocalDateTime.now().minusDays(2)
                    ),
                    Quote(
                            id = 4,
                            author = "Кочурин",
                            text = "Блять, да стой ты!",
                            creationDate = LocalDateTime.now().minusDays(3)
                    )
            )

}