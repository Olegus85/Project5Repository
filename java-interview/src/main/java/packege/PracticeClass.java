package packege;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeClass {
    public static void main(String[] args) {
        PersonGenerator generator = new PersonGenerator();

        List<Person> personList = new Random()
                .ints(4)
                .mapToObj(i -> generator.generate())
                .toList();

        List<Person> personList2 = new ArrayList<>(personList);
        personList2.add(new Person(null,43));
        boolean anton = personList2.stream()
                .filter(x->x.getName()!=null)
                .anyMatch(x -> x.getName().equals("Anton"));
        //collect.add(new org.olegus.types.Person());

        System.out.println(anton);
    }

}
@Setter
@Getter
class Person implements Comparable<Person>{
    private String name;
    private int age;

    Person() {}

    Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("Возраст не может быть отрицательным!!");
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public int compareTo(Person person1, Person person2) {

        return 0;
    }

    @Override
    public int compareTo(Person person1) {
        return this.age - person1.age;
    }
}
