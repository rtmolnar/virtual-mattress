package com.virtualmattress.virtualmattresscore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.virtual.mattress"])
class VirtualMattressCoreApplication

fun main(args: Array<String>) {
	runApplication<VirtualMattressCoreApplication>(*args)
}
