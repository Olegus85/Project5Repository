package packege;

import org.olegus.types.Person;

import java.util.Arrays;

public class BubbleSort implements SortAlgorithm<Person> {
    @Override
    public Generator<Person> getGenerator() {
        return new PersonGenerator();
    }

    @Override
    public Person[] sort(Person[] arrayOfPersons) {
        Person tempPerson;

        System.out.println("Before Bubble sorting: " + Arrays.toString(arrayOfPersons));

        for (int i = 0; i < arrayOfPersons.length - 1; i++) {
            for (int j = 0; j < (arrayOfPersons.length - 1) - i; j++) {
                if (arrayOfPersons[j].getAge() > arrayOfPersons[j + 1].getAge()) {
                    tempPerson = arrayOfPersons[j];
                    arrayOfPersons[j] = arrayOfPersons[j + 1];
                    arrayOfPersons[j + 1] = tempPerson;
                }
            }
        }
        System.out.println("After Bubble sorting: " + Arrays.toString(arrayOfPersons));

        return arrayOfPersons;
    }

}
