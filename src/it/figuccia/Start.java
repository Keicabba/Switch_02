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

            if (input.equals("size")) {
                System.out.println("The size of the list is: " + list.size());
            } else if (input.equals("clear")) {
                list.clear();
                System.out.println("The list has been cleared.");
            } else if (input.equals("print")) {
                System.out.println(list);
            } else if (input.equals("exit")) {
                shouldContinue = false;
            } else {
                list.add(input);
            }
        }
        System.out.println("Exiting");
    }
}
