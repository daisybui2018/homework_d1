package Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","
 Display to screen the whole list of number in decreasing sorting order.
 If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".
 Requirements:
 •The program must read a string of numbers from the keyboard.
 •The readData method is to read numbers from the keyboard
 •The readData method must contain a try-catch block.
 •The sortNumber method is to sorting list of numbers into decreasing order.
 •The readData method calls sortNumber method.
 •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */
public class Task1 {
    public List<Integer> readData() {
        //write your code here
        List<Integer> numberList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            numberList.clear();
            try {
                System.out.println("Enter a string of numbers: ");
                String line = scan.nextLine();
                for (String number : line.split(",")) {
                    numberList.add(Integer.parseInt(number.trim(), 10));
                }
            } catch (NumberFormatException e) {
                System.out.println("String contains character which cannot be converted into number");
                continue;
            }
            break;
        }
        scan.close();
        return numberList;
    }
    public List<Integer> sortNumberList(List<Integer> list){
        //write your code here
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
    public static void main(String[] args) {
        //write your code here
        List<Integer> numberListA = new ArrayList<>();
        Task1 t1 = new Task1();
        numberListA = t1.readData();
        t1.sortNumberList(numberListA);
        System.out.println("################");
        System.out.println("List of numbers into decreasing order");
        System.out.println(numberListA.toString());
    }
}