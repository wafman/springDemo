package com.fritts.code401d4.day12.firstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Mark this class as a controller so that Spring Boot knows to look at it.
@RestController

public class HelloWorldController {

    //specify the route for this method
    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World! It's a beautiful day.";
    }

    @GetMapping("/hello/{name}/{from}")
    public String getHelloToMe(@PathVariable String name , @PathVariable String from){
        return "Hello, " + name + " from " + from;
    }
}
