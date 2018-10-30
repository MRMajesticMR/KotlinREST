package ru.test.kotlinrest.models.data

import javax.persistence.*

/**
 * Model for Quote Author
 */
@Entity
@Table(name = "quote_authors")
class QuoteAuthor(

        @Id @GeneratedValue
        @Column(name = "id")
        var id: Long? = null,

        @Column(name = "surname")
        var surname: String? = null,

        @Column(name = "name")
        var name: String? = null,

        @Column(name = "middlename")
        var middlename: String? = null
)