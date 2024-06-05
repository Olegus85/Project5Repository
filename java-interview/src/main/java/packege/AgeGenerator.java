package packege;

import java.util.Random;

public class AgeGenerator implements Generator<Integer> {
    static Random random = new Random();

    @Override
    public Integer generate() {
        return random.nextInt(4,66);
    }
}
