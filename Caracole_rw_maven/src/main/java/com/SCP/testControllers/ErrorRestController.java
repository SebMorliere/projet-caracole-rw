package com.SCP.testControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error/")
public class ErrorRestController {
    @RequestMapping(method = RequestMethod.GET)
    public String showError() {
        return "<h1>Page not found!<h1>";
    }
}
