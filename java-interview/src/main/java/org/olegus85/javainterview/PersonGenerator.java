package org.olegus85.javainterview;

import org.olegus.types.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personGeneratorBean")
public class PersonGenerator implements Generator<Person>{
    @Autowired
    private NameGenerator nameGenerator;
    @Autowired
    private AgeGenerator ageGenerator;

    @Override
    public Person generate() {
        return new Person(nameGenerator.generate(), ageGenerator.generate());
    }
}
