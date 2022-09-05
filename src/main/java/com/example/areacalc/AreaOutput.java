package com.example.areacalc;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaOutput {

    @RequestMapping("/calculate")
    public double area(@RequestParam String form, @RequestParam double a){
       if (form.equals("square")){
           return a*a;
       }
        return a;
    }
}
