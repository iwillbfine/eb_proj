package com.iwillbfine.eb_proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("health")
    public String health() {
        return "eb_proj is fine!";
    }
}
