package application

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @RequestMapping("/api/greet")
    fun helloWorld(@RequestParam name: String): String {
        return "hello $name"
    }
}