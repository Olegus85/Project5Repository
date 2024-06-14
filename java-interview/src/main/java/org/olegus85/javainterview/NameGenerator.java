package org.olegus85.javainterview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component("nameGeneratorBean")
public class NameGenerator implements Generator<String>{
    @Autowired
    Random random;
    private static List<String> names = List.of("Anton", "Michael", "Lena", "Oleg", "Dmitry", "Olga");

    @Override
    public String generate() {
        return names.get(random.nextInt(names.size()));
    }
}
