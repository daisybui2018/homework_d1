package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Use the keyboard to enter the number N.
 *
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 *
 * 3. Find the minimum among the list items: the getMinimum method.
 *
 * Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args){
        //write your code here
        Task4 task = new Task4();
        List<Integer> list = task.getIntegerList();
        System.out.printf("Minimum number: %d\n", task.getMinimum(list));
    }

    public int getMinimum(List<Integer> array) {
        // write your code here
        return Collections.min(array);
    }

    public List<Integer> getIntegerList(){
        // write your code here
        Scanner sc = new Scanner(System.in);
        Integer n = null;
        while (n == null) {
            System.out.print("Please enter number of list: ");
            String line = sc.nextLine();
            try {
                n = Integer.parseInt(line.trim(), 10);
            } catch (NumberFormatException e) {
                System.out.println("Enter item as a integer > 0");
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter number of %d: ", i);
            Integer element = null;
            while (element == null) {
                String line = sc.nextLine();
                try {
                    element = Integer.parseInt(line.trim(), 10);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid number");
                }
            }
            list.add(element);
        }
        sc.close();
        return list;
    }
}
