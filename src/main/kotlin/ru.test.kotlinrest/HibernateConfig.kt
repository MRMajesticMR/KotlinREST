package ru.test.kotlinrest

import com.mchange.v2.c3p0.ComboPooledDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.hibernate5.HibernateTransactionManager
import org.springframework.orm.hibernate5.LocalSessionFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*

@Configuration
@EnableTransactionManagement
open class HibernateConfig {

    @Bean
    open fun sessionFactory() =
            LocalSessionFactoryBean().apply {
                setDataSource(dataSource())
                setPackagesToScan("ru.test.kotlinrest.models")
                hibernateProperties = hibernateProperties()
            }

    @Bean
    open fun dataSource() = ComboPooledDataSource().apply {
        driverClass = "com.mysql.cj.jdbc.Driver"
        jdbcUrl = "jdbc:mysql://localhost:3306/quotes?serverTimezone=UTC"
        user = "root"
        password = "Fylhttdbx2"
    }

    @Bean
    open fun hibernateTransactionManager() = HibernateTransactionManager().apply {
        sessionFactory = sessionFactory().`object`
    }

    private fun hibernateProperties() = Properties().apply {
        setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
        setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false")
    }
}