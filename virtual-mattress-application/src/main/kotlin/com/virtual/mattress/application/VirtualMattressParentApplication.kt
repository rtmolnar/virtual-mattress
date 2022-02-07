package com.virtual.mattress.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VirtualMattressParentApplication

fun main(args: Array<String>) {
	runApplication<VirtualMattressParentApplication>(*args)
}
