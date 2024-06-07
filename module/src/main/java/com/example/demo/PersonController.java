package com.example.demo;

import org.olegus.types.Person;
import org.olegus85.javainterview.PersonGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PersonController {
    public List<Person> getGeneratedPersonList() {
        PersonGenerator personGenerator = new PersonGenerator();
        return Stream.iterate(personGenerator.generate(), person -> personGenerator.generate())
                .limit(new Random()
                        .nextInt(10))
                .collect(Collectors.toList());
    }
}
