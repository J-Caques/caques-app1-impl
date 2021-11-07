package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MarkedListTest {
    HashMap<String,String> incomplete = new HashMap<>();
    HashMap<String,String> completed = new HashMap<>();
    AccessList list = new AccessList();
    @Test
    void markIncomplete() throws IOException {
        HashMap <String, String> list = new HashMap<>();
        list.put("Ice Cream", "12-10-2021");
        list.put("Toothpaste", "");

        Object temp = list.get("Ice Cream");
        incomplete.put("Ice Cream",(String) temp);
        Assertions.assertEquals("12-10-2021", incomplete.get("Ice Cream"));
    }

    @Test
    void markComplete() throws IOException {
        HashMap <String, String> list = new HashMap<>();
        list.put("Ice Cream", "12-10-2021");
        list.put("Toothpaste", "");

        Object temp = list.get("Ice Cream");
        completed.put("Ice Cream",(String) temp);
        Assertions.assertEquals("12-10-2021", completed.get("Ice Cream"));
    }
}