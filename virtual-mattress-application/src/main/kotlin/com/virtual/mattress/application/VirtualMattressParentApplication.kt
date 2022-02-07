package com.virtual.mattress.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["com.virtual.mattress"])
@EnableJpaRepositories("com.virtual.mattress")
@EntityScan("com.virtual.mattress")
class VirtualMattressParentApplication

fun main(args: Array<String>) {
	runApplication<VirtualMattressParentApplication>(*args)
}
