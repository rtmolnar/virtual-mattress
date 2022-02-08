package com.virtual.mattress.model.form

import java.math.BigDecimal
import java.util.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size
import kotlin.collections.ArrayList

data class UpdateExpenseForm(
    @field:NotNull val id: Long,
    @field:NotEmpty @field:Size(min = 5) val title: String,
    val labels: List<String> = ArrayList(),
    @field:NotNull val value: BigDecimal,
    val currency: Currency?
)
