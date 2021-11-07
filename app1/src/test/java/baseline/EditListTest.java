package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EditListTest {

    @Test
    void addItem() throws IOException {
        HashMap <String, String> list = new HashMap<>();
        list.put("Ice Cream", "12-10-2021");
        list.put("Toothpaste", "");


        //if (HashMap.size > 256) exit method.
        if (list.size() == 100){
            System.out.print("The list has reached its maximum number of items");
            return;
        }
        assertTrue(list.containsKey("Ice Cream"));
        assertTrue(list.containsKey("Toothpaste"));
    }

    @Test
    void removeItem() throws IOException {
        HashMap <String, String> list = new HashMap<>();
        list.put("Ice Cream", "12-10-2021");
        list.put("Toothpaste", "");

        //toDoList.remove to remove one of the items from the HashMap List
        list.remove("Ice Cream");

        Assumptions.assumeFalse(list.containsKey("Ice Cream"));
    }

    @Test
    void changeDescription(){
        HashMap <String, String> list = new HashMap<>();
        list.put("Ice Cream", "12-10-2021");
        list.put("Toothpaste", "");

        Object temp = list.get("Ice Cream");
        list.put("Chocolate", (String) temp);
        list.remove("Ice Cream");

        Assertions.assertTrue(list.containsKey("Chocolate"));
        Assertions.assertEquals("12-10-2021", list.get("Chocolate"));
        Assertions.assertFalse(list.containsKey("Ice Cream"));
    }

    @Test
    void changeDueDate(){
        HashMap<String,String> list = new HashMap<>();
        list.put("Toothpaste", "");

        list.replace( "Toothpaste", "2021-12-22");

        Assertions.assertEquals("2021-12-22", list.get("Toothpaste"));
    }
}