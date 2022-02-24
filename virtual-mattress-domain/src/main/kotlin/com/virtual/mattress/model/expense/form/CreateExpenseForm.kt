package com.virtual.mattress.model.expense.form

import java.math.BigDecimal
import java.util.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import kotlin.collections.ArrayList

data class CreateExpenseForm(
    @field:NotEmpty val title: String,
    val label: List<String> = ArrayList(),
    @field:NotNull val value: BigDecimal,
    val currency: Currency?,
    val userId: Long,
    val sheetId: Long
)
