package com.virtual.mattress.common.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}
