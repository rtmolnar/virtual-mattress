package com.virtual.mattress.sheet.repository

import com.virtual.mattress.sheet.model.Sheet
import org.springframework.data.jpa.repository.JpaRepository

interface SheetRepository: JpaRepository<Sheet, Long> {}
