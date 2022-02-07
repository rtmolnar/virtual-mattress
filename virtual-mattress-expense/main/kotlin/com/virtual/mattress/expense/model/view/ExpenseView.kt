package com.virtual.mattress.expense.model.view

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

data class ExpenseView(
    val id: Long?,
    val title: String,
    val labels: List<String> = ArrayList(),
    val value: BigDecimal,
    val currency: Currency?,
    val createDate: LocalDateTime
)