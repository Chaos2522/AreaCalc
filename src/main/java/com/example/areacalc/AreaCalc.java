package com.example.areacalc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController // json
public class AreaCalc {

    @RequestMapping("/area")
    public String index() {
            return "choose form: circle/rectangle/square and enter radius/a+b/a";
        }
    }

