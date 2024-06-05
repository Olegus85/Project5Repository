import org.olegus.types.Person;

import java.util.Arrays;

public class SelectionSort implements SortAlgorithm<Person> {
    @Override
    public Generator<Person> getGenerator() {
        return new PersonGenerator();
    }

    @Override
    public Person[] sort(Person[] arrayOfPersons) {
        System.out.println("Before Selection sorting: " + Arrays.toString(arrayOfPersons));

        for (int i = 0; i < arrayOfPersons.length; i++) {

            Person min = arrayOfPersons[i];

            int minIndex = i;
            for (int j = i + 1; j < arrayOfPersons.length; j++) {
                if (min.getAge() > arrayOfPersons[j].getAge()) {
                    min = arrayOfPersons[j];
                    minIndex = j;
                }
            }
            arrayOfPersons[minIndex] = arrayOfPersons[i];
            arrayOfPersons[i] = min;
        }

        System.out.println("After Selection sorting: " + Arrays.toString(arrayOfPersons));

        return new Person[0];
    }
}
