package org.olegus85.javainterview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("ageGeneratorBean")
public class AgeGenerator implements Generator<Integer> {
    @Autowired
    Random random;

    @Override
    public Integer generate() {
        return random.nextInt(4, 66);
    }
}
