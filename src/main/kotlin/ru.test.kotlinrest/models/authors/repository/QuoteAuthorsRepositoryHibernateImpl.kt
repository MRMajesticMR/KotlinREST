package ru.test.kotlinrest.models.authors.repository

import org.hibernate.SessionFactory
import org.springframework.stereotype.Repository
import ru.test.kotlinrest.models.data.QuoteAuthor
import org.springframework.beans.factory.annotation.Autowired

@Repository
open class QuoteAuthorsRepositoryHibernateImpl : QuoteAuthorsRepository {

    @Autowired
    lateinit var sessionFactory: SessionFactory

    override fun all(): List<QuoteAuthor> =
            sessionFactory.openSession().use { session ->
                session.createQuery("FROM QuoteAuthor", QuoteAuthor::class.java).list()
            }


}