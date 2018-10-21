package ru.test.kotlinrest.model.quotes

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
                            text = "С мудаками надо говорить по мудаццки"
                    ),
                    Quote(
                            id = 2,
                            author = "Смольянинов",
                            text = "Героям слава!  Слава нації! Смерть ворогам! Україна - понад усе!"
                    ),
                    Quote(
                            id = 3,
                            author = "Бухал",
                            text = "Меньше пизди, больше делай!"
                    ),
                    Quote(
                            id = 4,
                            author = "Кочурин",
                            text = "Блять, да стой ты!"
                    )
            )

}