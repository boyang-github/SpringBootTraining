package com.sylinx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello world spirngboot!";
    }

    @PostMapping("/posthello")
    public String test2(){
        return "post world spirngboot!";
    }

    @DeleteMapping("/deletehello")
    public String test3(){
        return "delete world spirngboot!";
    }

    @GetMapping("/param/{abc}/{bcde}")
    public String test4(@PathVariable String abc, @PathVariable String bcde){
        return "hello param get "+abc+" : "+bcde;
    }

    @DeleteMapping("/param1/{userId}/{password}")
    public String test5(@PathVariable String userId, @PathVariable String password){
        return "hello param get "+userId+" : "+password;
    }

}
