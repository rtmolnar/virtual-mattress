package com.virtual.mattress.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}
