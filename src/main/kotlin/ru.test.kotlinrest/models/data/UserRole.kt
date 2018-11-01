package ru.test.kotlinrest.models.data

import javax.persistence.*

/**
 * Role of Service User
 */
@Entity
@Table(name = "user_roles")
class UserRole(

        @Id @GeneratedValue
        @Column(name = "id")
        var id: Long? = null,

        @Column(name = "type")
        var type: String? = null,

        @Column(name = "name")
        var name: String? = null

)