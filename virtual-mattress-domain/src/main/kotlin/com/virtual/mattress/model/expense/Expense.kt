package com.virtual.mattress.model.expense

import com.virtual.mattress.model.sheet.Sheet
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
data class Expense(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String,
    @ElementCollection
    var labels: List<String> = ArrayList(),
    var value: BigDecimal,
    var currency: Currency? = null,
    val createDate: LocalDateTime = LocalDateTime.now(),
//    @ManyToOne
//    val user: User,
    @ManyToOne
    val sheet: Sheet
)
