package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AccessList {
    HashMap accessList(String file) {

        HashMap<String, String> list = new HashMap<>();

        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    list.put(key, value);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }

            for (String key : list.keySet()) {
                System.out.println(key + ":" + list.get(key));
            }
            reader.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
