package com.phenom.test.controller;

import com.phenom.test.service.CheckStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckStatusControler {
    @Autowired
    private CheckStatusService checkStatusService;

    @GetMapping("/check")
    public String checkStatus(@RequestParam(name="tid") String trackingNumber){
        return checkStatusService.checkStatus(trackingNumber);

    }
}
