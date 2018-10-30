package ru.test.kotlinrest.web.dto

data class GetAdminDTO(
    val users: List<UserDTO>
) {

    data class UserDTO(
            val id: Long,
            val fullName: String
    )

}