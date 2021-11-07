package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.util.HashMap;
import java.util.Scanner;

public class ListCreator {
   public String listTitle;
   StoreList store = new StoreList();


        //Create todo list
        void createList() {
            HashMap<String, String > list = new HashMap<>();
            System.out.print("Enter Filename: ");
                Scanner input = new Scanner(System.in);
                String fileName = input.nextLine();
            store.storeList(fileName, list);
        }
}
