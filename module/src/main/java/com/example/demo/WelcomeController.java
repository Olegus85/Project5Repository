package com.example.demo;

import lombok.AllArgsConstructor;
import org.olegus.types.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class WelcomeController {

    private final PersonController personController;

    @ResponseBody
    @GetMapping(value = "/person")
    public List<Person> sortByAge(Integer fromAge, Integer toAge) {
        return personController.getGeneratedPersonList().stream()
                .filter(person -> person.getAge() > fromAge && person.getAge() <= toAge)
                .collect(Collectors.toList());
    }

}
