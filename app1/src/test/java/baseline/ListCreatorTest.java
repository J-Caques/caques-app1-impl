package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ListCreatorTest {

        @Test
        void createList(){
          StoreList store = new StoreList();

          //Create HashMap to store description and due date
          HashMap<String, String> listTitle = new HashMap<>();
          store.storeList("Shopping List.txt", listTitle);

        }

}