package com.virtual.mattress.contoller

import com.virtual.mattress.model.expense.form.CreateExpenseForm
import com.virtual.mattress.model.expense.form.UpdateExpenseForm
import com.virtual.mattress.model.expense.view.ExpenseView
import com.virtual.mattress.service.ExpenseService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping("/expenses")
class ExpenseController(private val expenseService: ExpenseService) {

  @GetMapping
  fun list(
    @RequestParam(required = false) title: String?,
    @PageableDefault(size = 5, sort = ["createDate"], direction = Sort.Direction.DESC) pagination: Pageable
  ): Page<ExpenseView> {
    return expenseService.list(title, pagination)
  }

  @GetMapping("/{id}")
  fun getById(@PathVariable id: Long): ExpenseView {
    return expenseService.getById(id)
  }

  @GetMapping("/sheet/{sheetId}")
  fun getBySheetId(
    @PathVariable sheetId: Long,
    @PageableDefault(size = 5, sort = ["createDate"], direction = Sort.Direction.DESC) pagination: Pageable
  ): Page<ExpenseView> {
    return expenseService.getBySheetId(sheetId, pagination);
  }

  @PostMapping
  @Transactional
  fun create(
      @RequestBody @Valid createExpenseForm: CreateExpenseForm,
      uriBuilder: UriComponentsBuilder
  ): ResponseEntity<ExpenseView> {
    val expenseView = expenseService.create(createExpenseForm)
    val uri = uriBuilder.path("/expenses/${expenseView.id}").build().toUri()
    return ResponseEntity.created(uri).body(expenseView)
  }

  @PutMapping
  @Transactional
  fun update(@RequestBody @Valid updateExpenseForm: UpdateExpenseForm): ResponseEntity<ExpenseView> {
    val expenseView = expenseService.update(updateExpenseForm)
    return ResponseEntity.ok(expenseView)
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  fun delete(@PathVariable id: Long) {
    expenseService.delete(id)
  }

//    @GetMapping("/report")
//    fun report(): List<ExpensesByLabel> {
//        return expenseService.report()
//    }
}
