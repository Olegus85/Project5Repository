import java.util.Arrays;
import java.util.Random;

public class ArrayPersonGen {
    static Random random = new Random();
    static Person[] personsArray = new Person[5];
    static PersonGenerator personGenerator = new PersonGenerator();

    public static void main(String[] args) {
        int randomNumber = random.nextInt(20);
        Person tempPerson;

        if (randomNumber < 5) {
            personsArray = new Person[randomNumber];
            for (int i = 0; i < randomNumber; i++) {
                personsArray[i] = personGenerator.generate();
            }
        } else {
            for (int i = 0; i < randomNumber; i++) {
                try {
                    personsArray[i] = personGenerator.generate();
                } catch (ArrayIndexOutOfBoundsException e) {
                    personsArray = Arrays.copyOf(personsArray, randomNumber);
                } finally {
                    personsArray[i] = personGenerator.generate();
                }
            }
        }
        System.out.println("Before bubble sorting: " + Arrays.toString(personsArray));

        for (int i = 0; i < personsArray.length - 1; i++) {
            for (int j = 0; j < (personsArray.length - 1) - i; j++) {
                if (personsArray[j].getAge() > personsArray[j + 1].getAge()) {
                    tempPerson = personsArray[j];
                    personsArray[j] = personsArray[j + 1];
                    personsArray[j + 1] = tempPerson;
                }
            }
        }

        System.out.println("After bubble sort : " + Arrays.toString(personsArray));

    }
}
