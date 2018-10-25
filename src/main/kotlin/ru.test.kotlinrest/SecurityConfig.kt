package ru.test.kotlinrest

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
open class SecurityConfig: WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()
                ?.antMatchers("/admin**")
                ?.hasRole("ADMIN")
                ?.and()
                ?.httpBasic()
                ?.and()
                ?.csrf()?.disable()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth
                ?.inMemoryAuthentication()
                ?.withUser("Admin")
                ?.password("{noop}Admin")
                ?.roles("ADMIN")
    }

}