import java.util.Arrays;
import java.util.Random;

public class BubbleSort implements SortAlgorithm<Person> {
    @Override
    public Generator<Person> generate() {
        return new PersonGenerator();
    }

    public Person[] generateArray() {
        Person[] personsArray = new Person[5];
        Random random = new Random();
        int randomNumber = random.nextInt(5, 20);

        if (randomNumber < 5) {
            personsArray = new Person[randomNumber];
            for (int i = 0; i < randomNumber; i++) {
                personsArray[i] = generate().generate();
            }
        } else {
            for (int i = 0; i < randomNumber; i++) {
                try {
                    personsArray[i] = generate().generate();
                } catch (ArrayIndexOutOfBoundsException e) {
                    personsArray = Arrays.copyOf(personsArray, randomNumber);
                } finally {
                    personsArray[i] = generate().generate();
                }
            }
        }
        return personsArray;
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
