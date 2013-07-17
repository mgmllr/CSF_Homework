import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //weirdLoop();
        //sort();
        //allAs();
        //reverseNumbers();
        //reverseArray();
        //isGeneticSequence();
        inputAndSearch();
        //calculator();
    }


    public static void sort() {
        int[] unsortedArray = {4,2,9,8,1,3,6,5};
        IntArraySorter sorter = new IntArraySorter();
        System.out.println("Unsorted: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted: " + Arrays.toString(sorter.sortArray(unsortedArray)));
    }

    public static void weirdLoop() {
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
        }
    }

    public static void allAs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String s = scanner.next();
            System.out.println("The string only contains the letter 'a': " + stringIsAllAs(s));
        }
    }

    public static boolean stringIsAllAs(String s) {
        int i = 0;
        while (i < s.length()) {
            char character = s.charAt(i);
            if (character == 'a' || character == 'A') {
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void reverseNumbers() {
        // 1) Ask the user for how many numbers they want to enter
        // 2) Let them enter that many numbers
        // 3) Print them out in reverse

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter?");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.print("Okay, go ahead!");
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
            if(i == n) {
                break;
            }
        }
        for (int j = 0; j < array.length; j++){
            System.out.print(array[n-1] + " ");
            n--;
        }
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 0214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        // 1) Reverse the above array above without creating a new array, then print it out
        int n = array.length;

        for(int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[n-1];
            array[n-1] = temp;
            n--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        // 3) Otherwise, print false
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string.");
        String string = scanner.next();
        int i = 0;
        while(i < string.length()) {
            char c = string.charAt(i);
            if(c == 'G' || c == 'A' || c == 'T' || c == 'C') {
                i++;
            } else {
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
    }

    public static void inputAndSearch() {
        // 1) Ask the user to input 10 words
        // 2) Then ask the user to input a search word
        // 3) If the word exists in the first 10 words, print true, otherwise print false
        // 4) Return to step 2
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please input 10 words.");
            String[] array = new String[10];
            for(int i = 0; i < 10; i++) {
                String word = scanner.next();
                array[i] = word;
            }
            System.out.print("Input a search word.");
            String search_word = scanner.next();
            for(int i = 0; i < 10; i++) {
                if(search_word.equals(array[i])) {
                    System.out.println(true);
                    return;
                }
            }
            System.out.println(false);
        }
    }

    public static void calculator() {
        // Below is a very simple calculator
        // 1) Modify it to support both addition, subtraction and multiplication operations
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an addition, subtraction, or multiplication statement in the format x + y: ");
            Integer leftOperand = scanner.nextInt();
            String sign = scanner.next(); // The "+" sign, just ignore this
            Integer rightOperand = scanner.nextInt();
            if(sign.equals("+")) {
                System.out.println("Resulting value is: " + (leftOperand.intValue() + rightOperand.intValue()));
            } else if(sign.equals("-")) {
                System.out.println("Resulting value is: " + (leftOperand.intValue() - rightOperand.intValue()));
            } else if(sign.equals("*")) {
                System.out.println("Resulting value is: " + (leftOperand.intValue() * rightOperand.intValue()));
            } else  {
                System.out.println("Invalid format");
            }
        }
    }
}
