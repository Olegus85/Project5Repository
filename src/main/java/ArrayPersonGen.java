import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayPersonGen {
    public static void main(String[] args) {
        List<SortAlgorithm<Person>> sortAlgorithms = List.of(new BubbleSort(), new InsertSort());

        sortAlgorithms.forEach(sortMethod -> {
            Generator<Person> generator = sortMethod.getGenerator();

            List<Person> personList = new Random()
                    .ints(10)
                    .mapToObj(i -> generator.generate())
                    .toList();

            Person[] sortedList = sortMethod.sort(personList.toArray(new Person[0]));

            Iterator<Person> iterator = Arrays.stream(sortedList).toList().listIterator();
            Person element = iterator.next();
            while (iterator.hasNext()) {
                Person nextElement = iterator.next();
                if (element.getAge() > nextElement.getAge())
                    System.out.println("sorting is incorrect");
            }
        });
    }
}
