package com.example.demo;

import org.olegus.types.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class WelcomeController {

    PersonController personController;

    @Autowired
    public WelcomeController(PersonController personController) {
        this.personController = personController;
    }

    @GetMapping("/person")
    public List<Person> sortByAge(Integer fromAge, Integer toAge) {
         return personController.getGeneratedPersonList().stream()
                 .filter(person -> person.getAge() > fromAge && person.getAge() <= toAge)
                 .collect(Collectors.toList());
    }
}
