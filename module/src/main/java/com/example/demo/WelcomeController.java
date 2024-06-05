package com.example.demo;

import org.olegus.types.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/person")
    public Person welcome() {
        return new Person("Stepan",36);
    }
}
