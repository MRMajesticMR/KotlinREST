package ru.test.kotlinrest.models.data

import javax.persistence.*

/**
 * Service User
 */
@Entity
@Table(name = "users")
class User(

        @Id @GeneratedValue
        @Column(name = "id")
        var id: Long? = null,

        @Column(name = "surname")
        var surname: String? = null,

        @Column(name = "name")
        var name: String? = null,

        @Column(name = "middlename")
        var middlename: String? = null,

        @Column(name = "login")
        var login: String? = null,

        @Column(name = "password")
        var password: String? = null,

        @Column(name = "active")
        var active: Boolean? = null

)