package com.jeevankumar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGithubActionsApplication {

    @GetMapping("/welcome")
    public String welCome() {
        return "Welcome to github actions workflows...!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGithubActionsApplication.class, args);
    }

}
