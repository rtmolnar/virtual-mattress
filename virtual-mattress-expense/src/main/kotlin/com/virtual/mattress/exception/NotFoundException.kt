package com.virtual.mattress.exception

import java.lang.RuntimeException

class NotFoundException(message: String?) : RuntimeException(message) {
}