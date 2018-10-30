package ru.test.kotlinrest.web.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import ru.test.kotlinrest.models.authors.repository.QuoteAuthorsRepository
import ru.test.kotlinrest.models.data.QuoteAuthor
import ru.test.kotlinrest.web.dto.GetAdminDTO

@Controller
class AdminController {

    @Autowired
    private lateinit var quoteAuthorsRepository: QuoteAuthorsRepository

    /**
     * Method GET /admin
     */
    @RequestMapping(
            value = ["/admin"],
            method = [RequestMethod.GET]
    )
    fun getAdmin(): ModelAndView =
            ModelAndView("admin")
                    .addObject("data", assemblyGetAdminDto(quoteAuthorsRepository.all()))

    private fun assemblyGetAdminDto(quoteAuthors: List<QuoteAuthor>) =
            GetAdminDTO(
                    users = quoteAuthors.map {
                        GetAdminDTO.UserDTO(
                                id = it.id ?: 0,
                                fullName = "${it.surname} ${it.name} ${it.middlename}"
                        )
                    }
            )

}