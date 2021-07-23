package Task;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Task5Test {

    @Test
    public void testRemoveAllNumbersGreaterThan10() {
        Task5 task = new Task5();
        Set<Integer> set = task.createSet();
        Set<Integer> expected = new HashSet<Integer>();
        Collections.addAll(expected, 5, 6, 7, 8, 9, 10);
        assertEquals(expected, task.removeAllNumbersGreaterThan10(set));
    }
}
