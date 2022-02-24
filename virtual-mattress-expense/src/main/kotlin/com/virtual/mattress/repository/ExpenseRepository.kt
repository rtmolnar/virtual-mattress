package com.virtual.mattress.repository

import com.virtual.mattress.model.expense.Expense
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExpenseRepository: JpaRepository<Expense, Long> {

    fun findByTitle(title: String, pagination: Pageable): Page<Expense>

    fun findBySheetId(sheetId: Long, pagination: Pageable): Page<Expense>

//    @Query("SELECT new com.virtualmattress.model.dto.ExpenseReport(expense.label, count(e)) FROM expense_labels e JOIN e.expense expense GROUP BY expense.label")
//    fun report(): List<ExpensesByLabel>
}
