package ru.test.kotlinrest.models.data

import javax.persistence.*

@Entity
@Table(name = "quotes")
class Quote(

        @Id @GeneratedValue
        @Column(name = "id")
        val id: Long? = null,

        @Column(name = "text")
        val text: String? = null
)