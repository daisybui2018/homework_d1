package Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 Create a set of numbers (Set<Integer>) and add 10 different numbers to it.

 Remove from the set all numbers greater than 10 .

 Requirements:
 •Create createSet() method to create and return a HashSet containing 10 different numbers.
 •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 •Write unit test for the removeAllNumbersGreaterThan10() method
 */
public class Task5 {

    public Set<Integer> createSet() {
        //write your code here
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 5; i < 15; i++) {
            result.add(i);
        }
        return result;
    }
    public Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        //write your code here
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i > 10) {
                iterator.remove();
            }
        }
        return set;
    }

}
