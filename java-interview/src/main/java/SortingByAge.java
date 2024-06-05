import org.olegus.types.Person;

import java.util.Collections;
import java.util.List;

public class SortingByAge {
    static List<Person> personList = DynamicPersonsList.listOfPersons();
    static List<Person> personList2 = DynamicPersonsList.listOfPersons();

    public static void sortingUsingCompareToInPersonClass(List<Person> list) {
        Collections.sort(list);
        System.out.println("After sorting via CompareToMethodInClass: " + list);
    }

    public static void sortingUsingComparatorClass(List<Person> list) {
        Collections.sort(
                list,
                (person1, person2) -> person1.getAge() - person2.getAge()
        );
        System.out.println("After sorting using ComparatorClass: " + list);
    }

    public static void main(String[] args) {
        System.out.println("List 1 Before sorting: " + personList);    //before sorting
        sortingUsingCompareToInPersonClass(personList);                 //using CompareTo Override method in org.olegus.types.Person class
        System.out.println();
        System.out.println("List 2 Before sorting: " + personList2);    //list2 before sorting
        sortingUsingComparatorClass(personList2);                       //using ComparatorClass
    }
}
