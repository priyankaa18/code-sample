package com.charter.enterprise.motd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class MotdController {

    @GetMapping
    public String getMotd() {
        return "Welcome to Charter.  All systems are nominal.";
    }

}
