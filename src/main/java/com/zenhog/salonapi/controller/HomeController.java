package com.zenhog.salonapi.controller;

import com.zenhog.salonapi.entity.SalonDetails;
import com.zenhog.salonapi.repository.SalonServiceDetailRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private final SalonDetails salonDetails;

    public HomeController(SalonDetails salonDetails) {
        this.salonDetails = salonDetails;
    }

    @GetMapping("/success")
    @ResponseBody
    public String getSuccess() {
        return salonDetails.toString();
    }
    
}
