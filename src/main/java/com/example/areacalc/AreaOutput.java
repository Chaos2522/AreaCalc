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
       if (form.equals("circle")){
           return Math.PI *(a*a);
       }
        return a;
    }
    public double area(@RequestParam String form, @RequestParam double a,@RequestParam double b){
        if (form.equals("rectangle")){
            return a*b;
        }
        return -1;
    }
}
