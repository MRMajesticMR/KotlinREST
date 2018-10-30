package ru.test.kotlinrest.models.quotes.repository

import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import ru.test.kotlinrest.models.data.Quote

@Repository
open class QuotesRepositoryHibernateImpl: QuotesRepository {

    @Autowired
    lateinit var sessionFactory: SessionFactory

    override fun all(): List<Quote> =
            sessionFactory.openSession().use { session ->
                session.createQuery("FROM Quote", Quote::class.java).list()
            }

}