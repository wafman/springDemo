package com.fritts.code401d4.day12.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//not rest
//thymeleaf, our view engine, will try to handle what we return from these methods.
//thymeleaf expects the string we return to be the name of a template
@Controller
public class NotARestController {

    @GetMapping("/notresthello")
    public String getNotRestHelloWorld(Model model){
        //this means that thymeleaf should render a template named "hello"
        String[] allTheNames = new String[]{"William", "Robert", "Stephen", "David"};
        model.addAttribute("names", allTheNames);
        return "hello";
    }

}
