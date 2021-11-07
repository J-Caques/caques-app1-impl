package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MarkedList {
    HashMap<String,String> incomplete = new HashMap<>();
    HashMap<String,String> completed = new HashMap<>();
    AccessList list = new AccessList();

    void markIncomplete(String item) throws IOException {
        System.out.print("Enter file name: ");
            Scanner input = new Scanner(System.in);
            String fileName = input.nextLine();

        HashMap<String,String> toDoList = list.accessList(fileName);

        Object temp = toDoList.get(item);
        incomplete.put(item,(String) temp);
    }

    void markComplete(String item) throws IOException {
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        HashMap<String,String> toDoList = list.accessList(fileName);

        Object temp = toDoList.get(item);
        completed.put(item,(String) temp);
    }
}
