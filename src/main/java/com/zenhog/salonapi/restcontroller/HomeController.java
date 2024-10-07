package com.zenhog.salonapi.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/success")
    @ResponseBody
    public String getSuccess() {
        return "Success";
    }
    
}
