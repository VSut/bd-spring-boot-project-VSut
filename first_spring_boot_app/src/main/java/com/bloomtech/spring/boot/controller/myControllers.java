package com.bloomtech.spring.boot.controller;

import com.bloomtech.spring.boot.model.theData;
import org.springframework.web.bind.annotation.*;

@RestController
public class myControllers {
    @GetMapping(value = "/")
    public String rootPathMethod(){
        System.out.println("Method for GET with path '/' was executed");
        return "Root path method was called";
    }
    @GetMapping(value = "/startrek")
    public String anyNameYouWant(@RequestParam String value){
        System.out.println("Controller method for path '/startrek' was called");
        return"Star Trek method was called with param value: " + value;
    }
    @GetMapping(value = "/startrek/Spok")
    public String anyNameYouWant2(){
        System.out.println("Controller method for path '/startrek' was called");
        return "Live Long and Prosper!";
    }
    @PostMapping(value = "/")
    public String wilburPost(@RequestBody theData theData){
        System.out.println("POST Controller method for path '/startrek' was called");
        System.out.println("the data sent with the request was :" + theData);
        return "Mr.ed was a talking horse";
    }
}
