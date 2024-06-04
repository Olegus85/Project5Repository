import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

public class SortTest {
    @Test
    public void sortingTest() {
        List<SortAlgorithm<Person>> sortAlgorithms = List.of(new BubbleSort(), new InsertSort(), new SelectionSort());

        sortAlgorithms.forEach(sortMethod -> {
            Generator<Person> generator = sortMethod.getGenerator();

            List<Person> personList = new Random()
                    .ints(10)
                    .mapToObj(i -> generator.generate())
                    .toList();

            Person[] sortedList = sortMethod.sort(personList.toArray(Person[]::new));

            for (int i = 0; i < sortedList.length - 1; i++) {
                Assert.assertTrue(sortedList[0].getAge() <= sortedList[i].getAge());
            }
        });
    }
}