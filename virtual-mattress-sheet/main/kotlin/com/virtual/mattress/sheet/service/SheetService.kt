package com.virtual.mattress.sheet.service

import com.virtual.mattress.sheet.model.Sheet
import com.virtual.mattress.sheet.repository.SheetRepository
import org.springframework.stereotype.Service

@Service
class SheetService(private val sheetRepository: SheetRepository) {

  fun getById(id: Long): Sheet {
    return sheetRepository.getById(id)
  }
}
