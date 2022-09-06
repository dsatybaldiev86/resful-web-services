package com.daniiar.rest.webservices.resfulwebservices.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

    //method - "Hello World"
    //GET
    //URI - /hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello Wolrd";
    }

    //hello-world-bean
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
//        throw new RuntimeException("Some Error has Happened!");
        return new HelloWorldBean("This is a message from the backend");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldParameter(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }
}
