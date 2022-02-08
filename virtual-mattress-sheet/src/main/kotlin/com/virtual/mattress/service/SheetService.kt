package com.virtual.mattress.service

import com.virtual.mattress.model.Sheet
import com.virtual.mattress.repository.SheetRepository
import org.springframework.stereotype.Service

@Service
class SheetService(private val sheetRepository: SheetRepository) {

  fun getById(id: Long): Sheet {
    return sheetRepository.getById(id)
  }
}
