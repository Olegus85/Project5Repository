package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.olegus.types.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class WelcomeController {

    private final PersonController personController;

    @GetMapping("/person")
    public List<Person> sortByAge(Integer fromAge, Integer toAge) {
        return personController.getGeneratedPersonList().stream()
                .filter(person -> person.getAge() > fromAge && person.getAge() <= toAge)
                .collect(Collectors.toList());
    }
}
