package pixel.academy.thymeleaf_app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());

        return "helloworld";
    }
    @RequestMapping("/greetingNewForm")
    public String generateGreeting(@RequestParam("studentName") String theName, Model model){

        //transform the input to uppercase
        theName = theName.toLowerCase();

        //build the response message
        String result = "Submission successful. Use: " + theName;

        //add the message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }
}
