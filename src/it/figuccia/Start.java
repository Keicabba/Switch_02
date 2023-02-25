package it.figuccia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);

        while (shouldContinue) {
            System.out.print("Please enter a string: ");
            String input = scanner.nextLine();

            switch (input) {
                case "size":
                    System.out.println("The size of the list is: " + list.size());
                    break;
                case "clear":
                    list.clear();
                    System.out.println("The list has been cleared.");
                    break;
                case "print":
                    System.out.println(list);
                    break;
                case "exit":
                    shouldContinue = false;
                    break;
                default:
                    list.add(input);
                    break;
            }
        }
        System.out.println("Exiting");
    }
}
