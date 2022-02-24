package com.virtual.mattress.mapper

import com.virtual.mattress.common.mapper.Mapper
import com.virtual.mattress.model.expense.Expense
import com.virtual.mattress.model.expense.view.ExpenseView
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