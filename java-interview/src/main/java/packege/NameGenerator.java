package packege;

import java.util.List;
import java.util.Random;

public class NameGenerator implements Generator<String> {
    static Random random = new Random();
    private static List<String> names = List.of("Anton", "Michael", "Lena", "Oleg", "Dmitry", "Olga");

    @Override
    public String generate() {
        return names.get(random.nextInt(names.size()));
    }
}
