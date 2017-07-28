package devtoolstest

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class GreetingController {
    @RequestMapping("/greeting")
    fun greeting(model: Model): String {
        model.addAttribute("message", "hellooo")
        return "greeting"
    }
}
