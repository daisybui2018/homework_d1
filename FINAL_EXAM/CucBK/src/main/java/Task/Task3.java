package Task;

import java.util.Scanner;

/**
 * Write a method readString that reads a string from the keyboard.
 *
 * Write a method upperCaseString to change the first letter of each word to uppercase
 *
 * Display the result on the screen.
 *
 * Example input:
 * sam i am.
 *
 * Example output:
 * Sam I Am.
 *
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */
public class Task3 {
    public String readString()  {
        //write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String line = sc.nextLine();
        sc.close();
        return line;
    }

    public String upperCaseString (String s){
        //write your code here
        StringBuilder output = new StringBuilder();
        s.trim();
        String array[] = s.split("\\s+");
        for(int i = 0; i < array.length; i++){
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(' ');
        }
        return output.toString().trim();
    }

    public static void main(String[] args) {
        //write your code here
        Task3 task = new Task3();
        String input = task.readString();
        System.out.printf("Output: %s\n", task.upperCaseString(input));
    }

}
