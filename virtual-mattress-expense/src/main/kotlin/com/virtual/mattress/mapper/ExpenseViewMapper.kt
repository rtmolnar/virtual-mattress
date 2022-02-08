package com.virtual.mattress.mapper

import com.virtual.mattress.model.Expense
import com.virtual.mattress.model.view.ExpenseView
import org.springframework.stereotype.Component

@Component
class ExpenseViewMapper: Mapper<Expense, ExpenseView> {

    override fun map(t: Expense): ExpenseView {
        return ExpenseView(
            id = t.id,
            title = t.title,
            labels = t.labels,
            value = t.value,
            currency = t.currency,
            createDate = t.createDate
        )
    }
}