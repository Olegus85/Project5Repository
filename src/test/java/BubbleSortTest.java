import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class BubbleSortTest {
    @Test
    public void sortingTest() {
        boolean isSorted = true;

        PersonGenerator personGenerator = new PersonGenerator();
        BubbleSort bubbleSort = new BubbleSort();
        Person[] personsArray = new Random()
                .ints(5)
                .mapToObj(i -> personGenerator.generate())
                .toArray(Person[]::new);
        Person[] sortedPersonsArray = bubbleSort.sort(personsArray);

        if(sortedPersonsArray.length<=1){
            System.out.println("Array is 0 or 1 length, nothing to sort");
        }
        else {
            Person previous = sortedPersonsArray[0];
            for(int i=1;i<sortedPersonsArray.length;i++){
                if(previous.getAge()>sortedPersonsArray[i].getAge()){
                    isSorted=false;
                    break;
                }
                else previous=sortedPersonsArray[i];
            }
        }
        Assert.assertTrue(isSorted);
    }
}