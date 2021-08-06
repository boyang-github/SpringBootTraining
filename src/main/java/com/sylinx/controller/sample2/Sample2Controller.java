package com.sylinx.controller.sample2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample2Controller {

    @GetMapping("/sample2")
    public String sample1(){
        System.out.println("hello");
        System.out.println("sample2 exec");
        System.out.println("bye");
        return "sample2_1";
    }
}
