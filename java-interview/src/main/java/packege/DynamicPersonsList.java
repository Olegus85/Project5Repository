package packege;

import org.olegus.types.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DynamicPersonsList {
    static Random random = new Random();
    static List<Person> personList = listOfPersons();

    public static List<Person> listOfPersons() {
        int numberOfPersons = random.nextInt(10, 20);
        List<Person> personList = new ArrayList<>();
        PersonGenerator personGenerator = new PersonGenerator();

        for (int i = 0; i < numberOfPersons; i++) {
            personList.add(personGenerator.generate());
        }
        return personList;
    }

    public static void showLists() {
         List<Person> toKindergartenList = new ArrayList<>();
         List<Person> toSchoolList = new ArrayList<>();
         List<Person> toWorkList = new ArrayList<>();

        for (Person person : personList){
            if (person.getAge() < 7)
                toKindergartenList.add(person);
            else if (person.getAge() >= 7 && person.getAge() < 19)
                toSchoolList.add(person);
            else toWorkList.add(person);
        }
        System.out.println("To Kindergarten(age<7): " + toKindergartenList);
        System.out.println("To School(age 7 to 18): " + toSchoolList);
        System.out.println("To Work(age 19+): " + toWorkList);

    }

    public static void main(String[] args) {
        showLists();
    }
}

