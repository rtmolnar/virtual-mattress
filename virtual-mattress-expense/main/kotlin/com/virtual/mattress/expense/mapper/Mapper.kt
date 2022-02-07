package com.virtual.mattress.expense.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}
