package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student names
        System.out.println("Enter student names separated by spaces: ");
        String inputLine = scanner.nextLine();
        String[] names = inputLine.split(" ");

        // Create ArrayList and add names
        ArrayList<String> studentList = new ArrayList<>();
        for (String name : names) {
            studentList.add(name);
        }

        // Input name to search
        System.out.println("Enter name to search: ");
        String searchName = scanner.next();

        // Check if the name exists in the list
        boolean found = false;
        for (String name : studentList) {
            if (name.equals(searchName)) {
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}


