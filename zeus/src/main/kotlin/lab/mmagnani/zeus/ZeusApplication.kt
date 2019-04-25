package lab.mmagnani.zeus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZeusApplication

fun main(args: Array<String>) {
	runApplication<ZeusApplication>(*args)
}
