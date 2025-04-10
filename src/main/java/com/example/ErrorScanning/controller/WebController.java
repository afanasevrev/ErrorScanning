package com.example.ErrorScanning.controller;

import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    private String getMainPage() {
        return "index";
    }
}
