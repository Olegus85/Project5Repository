import java.util.Arrays;
import java.util.Random;

public class InsertSort implements SortAlgorithm<Person> {
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
        System.out.println("Before Insert sorting: " + Arrays.toString(arrayOfPersons));

        for (int i = 1; i < arrayOfPersons.length; i++) {
            Person currentPerson = arrayOfPersons[i];
            int right = i;
            int left = i - 1;

            while (left >= 0 && currentPerson.getAge() < arrayOfPersons[left].getAge()) {
                arrayOfPersons[right] = arrayOfPersons[left];
                right--;
                left--;
            }
            arrayOfPersons[right] = currentPerson;
        }
        System.out.println("After Insert sorting: " + Arrays.toString(arrayOfPersons));

        return arrayOfPersons;
    }
}
