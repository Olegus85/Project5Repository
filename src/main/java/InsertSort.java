import java.util.Arrays;

public class InsertSort implements SortAlgorithm<Person> {
    @Override
    public Generator<Person> getGenerator() {
        return new PersonGenerator();
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
