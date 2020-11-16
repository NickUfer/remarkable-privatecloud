package dev.ufer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["dev.ufer", "dev.ufer.api", "dev.ufer.model"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
