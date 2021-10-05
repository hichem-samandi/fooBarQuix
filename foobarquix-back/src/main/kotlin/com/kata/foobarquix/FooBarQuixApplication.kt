package com.kata.foobarquix

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication

@SpringBootApplication
@Configuration
open class FooBarQuixApplication : ApplicationRunner {
	override fun run(args: ApplicationArguments) {
	}

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			runApplication<FooBarQuixApplication>(*args)
			SpringApplication.run(FooBarQuixApplication::class.java, *args)

		}
	}
}
