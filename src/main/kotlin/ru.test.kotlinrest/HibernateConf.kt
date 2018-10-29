package ru.test.kotlinrest

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.hibernate5.HibernateTransactionManager
import org.springframework.orm.hibernate5.LocalSessionFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*


@Configuration
@EnableTransactionManagement
open class HibernateConf {

    @Bean
    open fun sessionFactory() =
            LocalSessionFactoryBean().apply {
                setDataSource(dataSource())
                setPackagesToScan("ru.test.kotlinrest")
                hibernateProperties = hibernateProperties()
            }

    @Bean
    open fun dataSource() = BasicDataSource().apply {
        driverClassName = "org.h2.Driver"
        url = "jdbc:h2:mem:db;DB_CLOSE_DELAY=-1"
        username = "sa"
        password = "sa"
    }

    @Bean
    open fun hibernateTransactionManager() = HibernateTransactionManager().apply {
        sessionFactory = sessionFactory().`object`
    }

    private fun hibernateProperties() = Properties().apply {
        setProperty("hibernate.hbm2ddl.auto", "create-drop")
        setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect")
    }
}