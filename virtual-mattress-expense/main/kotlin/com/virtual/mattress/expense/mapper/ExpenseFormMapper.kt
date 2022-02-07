package com.virtual.mattress.expense.mapper

import com.virtual.mattress.expense.model.Expense
import com.virtual.mattress.expense.model.form.CreateExpenseForm
import com.virtual.mattress.sheet.service.SheetService
import org.springframework.stereotype.Component

@Component
class ExpenseFormMapper(
//    private val userService: UserService,
    private val sheetService: SheetService
) : Mapper<CreateExpenseForm, Expense> {

  override fun map(createExpenseForm: CreateExpenseForm): Expense {
    return Expense(
      title = createExpenseForm.title,
      labels = createExpenseForm.label,
      value = createExpenseForm.value,
      currency = createExpenseForm.currency,
//            user = userService.getById(createExpenseForm.userId),
      sheet = sheetService.getById(createExpenseForm.sheetId)
    )
  }

}
