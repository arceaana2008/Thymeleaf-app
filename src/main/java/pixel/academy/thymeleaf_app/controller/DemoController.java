package pixel.academy.thymeleaf_app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());

        return "helloworld";
    }
    @RequestMapping("/greting")
    public String generateGreeting(HttpServletRequest request, Model model){

        //retrieve the request param from the HTLM
        String theName = request.getParameter("studentName");

        //transform the input to uppercase
        theName = theName.toLowerCase();

        //build the response message
        String result = "Welcome, " + theName;

        //add the message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }
}
