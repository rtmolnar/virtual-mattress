package com.virtual.mattress.api

import com.virtual.mattress.libraryservice.api.ExpensesApi
import com.virtual.mattress.libraryservice.model.Expense
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class ExpanseController: ExpensesApi {

    override fun getAllExpensesByAccount(accountId: BigDecimal): ResponseEntity<List<Expense>>{

        var expense: Expense = Expense()
        expense.apply {
            this.account = BigDecimal.ONE
            this.label = "Beer"
            this.value = BigDecimal.valueOf(100)
        }

        var expenses = listOf(expense)

        return ResponseEntity.ok(expenses)
    }
}