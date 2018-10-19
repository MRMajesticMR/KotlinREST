package ru.test.kotlinrest.base

interface Mapper<F, T> {

    fun map(from: F): T

}