package com.virtual.mattress.expense.exception

import java.lang.RuntimeException

class NotFoundException(message: String?) : RuntimeException(message) {
}