package devtoolstest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application {
}

fun main(args: Array<String>) {
    val url = Application::class.java.getResource("/application.properties")
    println("!!!!!!!!!!!! $url")
    val cl = Thread.currentThread().contextClassLoader
    SpringApplication.run(Application::class.java, *args)
}
