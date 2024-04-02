package controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculo")
class CalculletorController {
    @GetMapping("/sum")
    fun sum(@RequestParam n1: Int, @RequestParam n2: Int) = n1 + n2
}