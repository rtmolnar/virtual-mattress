package com.virtual.mattress.service

import com.virtual.mattress.exception.NotFoundException
import com.virtual.mattress.mapper.ExpenseFormMapper
import com.virtual.mattress.mapper.ExpenseViewMapper
import com.virtual.mattress.model.form.CreateExpenseForm
import com.virtual.mattress.model.form.UpdateExpenseForm
import com.virtual.mattress.model.view.ExpenseView
import com.virtual.mattress.repository.ExpenseRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ExpenseService(
        private val expenseRepository: ExpenseRepository,
        private val expenseViewMapper: ExpenseViewMapper,
        private val expenseFormMapper: ExpenseFormMapper,
        private val notFoundMessage: String = "Expense not found"
) {

  fun list(title: String?, pagination: Pageable): Page<ExpenseView> {

    val expenses = if (title == null) {
      expenseRepository.findAll(pagination)
    } else {
      expenseRepository.findByTitle(title, pagination)
    }

    return expenses.map { expenseViewMapper.map(it) }
  }

  fun getById(id: Long): ExpenseView {
    val expense = expenseRepository.findById(id).orElseThrow { NotFoundException(notFoundMessage) }
    return expenseViewMapper.map(expense)
  }

  fun getBySheetId(sheetId: Long, pagination: Pageable): Page<ExpenseView> {
    val expenses = expenseRepository.findBySheet(sheetId, pagination)
    return expenses.map { expenseViewMapper.map(it) }
  }

  fun create(createExpenseForm: CreateExpenseForm): ExpenseView {
    var expense = expenseFormMapper.map(createExpenseForm)
    expenseRepository.save(expense)
    return expenseViewMapper.map(expense)
  }

  fun update(updateExpenseForm: UpdateExpenseForm): ExpenseView {
    val expense =
      expenseRepository.findById(updateExpenseForm.id).orElseThrow { NotFoundException(notFoundMessage) }

    expense.title = updateExpenseForm.title
    expense.labels = updateExpenseForm.labels
    expense.currency = updateExpenseForm.currency
    expense.value = updateExpenseForm.value

    return expenseViewMapper.map(expense)
  }

  fun delete(id: Long) {
    expenseRepository.deleteById(id)
  }

//    fun report(): List<ExpensesByLabel> {
//        return expenseRepository.report()
//    }
}
