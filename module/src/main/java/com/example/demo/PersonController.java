package com.example.demo;

import lombok.AllArgsConstructor;
import org.olegus.types.Person;
import org.olegus85.javainterview.PersonGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class PersonController {
    PersonGenerator personGenerator;
    Random random;

    public List<Person> getGeneratedPersonList() {
        return Stream.iterate(personGenerator.generate(), person -> personGenerator.generate())
                .limit(random
                        .nextInt(10))
                .collect(Collectors.toList());
    }
}
