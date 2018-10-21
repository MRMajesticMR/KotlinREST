package ru.test.kotlinrest

import com.google.gson.GsonBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.GsonHttpMessageConverter

@Configuration
open class ApplicationConfig {

    @Bean
    open fun httpMessageConverter(): HttpMessageConverter<*> =
            GsonHttpMessageConverter(
                    GsonBuilder()
                            .setDateFormat("dd.MM.yyyy HH:mm:ss:sss")
                            .create()
            )

}