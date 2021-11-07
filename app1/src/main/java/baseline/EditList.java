package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class EditList {
    AccessList list = new AccessList();
    StoreList store = new StoreList();

    void addItem() throws ParseException {
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        HashMap<String, String> toDoList = list.accessList(fileName);

        System.out.print("Enter Item: ");
        Scanner input2 = new Scanner(System.in);
        String item = input2.nextLine();
        if (item.length() == 0 || item.length() > 256) {
            System.out.print("Item must have 1-256 characters, enter again: ");
            Scanner input3 = new Scanner(System.in);
            item = input3.nextLine();
        }

        System.out.print("Enter due date (optional): ");
        Scanner input3 = new Scanner(System.in);
        String dueDate = input3.next();

        //Ensure due date matches YYYY-MM-dd format; it follows dates on Gregorian calendar
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        date.setLenient(false);
        Date dateFormat = date.parse(dueDate);

        toDoList.put(item, dueDate);

        //Save modified list back to file
        store.storeList(fileName, toDoList);
    }

    void removeItem() throws IOException {
        //Access list from AccessList
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        HashMap<String, String> toDoList = list.accessList(fileName);

        //Prompt user for item they wish to remove
        System.out.print("Enter item you wish to remove: ");
        Scanner input2 = new Scanner(System.in);
        String item = input2.nextLine();

        //Remove item from hashmap
        toDoList.remove(item);

        //Save modified list back to file
        store.storeList(fileName, toDoList);
    }

    void changeDescription() throws IOException {

        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        System.out.print("Enter item you wish to change: ");
        Scanner input2 = new Scanner(System.in);
        String item = input2.nextLine();

        System.out.print("Enter new item description: ");
        Scanner input3 = new Scanner(System.in);
        String newItem = input3.nextLine();
        //Access hashmap from .txt file
        HashMap<String, String> toDoList = list.accessList(fileName);
        //Create class Object temp to store value of original item
        Object temp = toDoList.get(item);
        //Place new item description w/ value from original item
        toDoList.put(newItem, (String) temp);
        //Remove original item
        toDoList.remove(item);

        //Save edited list back to file
        store.storeList(fileName, toDoList);
    }

    void changeDueDate() throws IOException {
        //Access hashmap from file
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        HashMap<String, String> toDoList = list.accessList(fileName);

        //Prompt for key value (the item)
        System.out.print("Enter item of the due date you wish to change: ");
        Scanner input2 = new Scanner(System.in);
        String item = input2.nextLine();

        //Prompt for new due date
        System.out.print("Enter new due date: ");
        Scanner input3 = new Scanner(System.in);
        String newDueDate = input3.next();

        //Change due date
        toDoList.replace(item, newDueDate);
    }

    void clearList() throws IOException {
        //Prompt user for file name
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        HashMap<String, String> toDoList = list.accessList(fileName);
        toDoList.clear();

        //Save cleared list back to file
        store.storeList(fileName, toDoList);
    }
}

