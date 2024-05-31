import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void sortingTest() {
        Person[] persons = new Person[4];
        Person person1 = new Person("Oleg", 34);
        Person person2 = new Person("Evgeniy", 16);
        Person person3 = new Person("Sveta", 50);
        Person person4 = new Person("Elena", 24);

        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;
        persons[3] = person4;
        Person[] expectedPersons = new Person[4];
        expectedPersons[0] = person2;
        expectedPersons[1] = person4;
        expectedPersons[2] = person1;
        expectedPersons[3] = person3;


        SortAlgorithm<Person> bubbleAlgorithm = new BubbleSort();
        Assert.assertArrayEquals(expectedPersons, bubbleAlgorithm.sort(persons));
    }
}