package com.virtual.mattress.repository

import com.virtual.mattress.model.Sheet
import org.springframework.data.jpa.repository.JpaRepository

interface SheetRepository: JpaRepository<Sheet, Long> {}
