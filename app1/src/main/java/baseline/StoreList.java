package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.io.*;
import java.util.Map;



public class StoreList {
    public void storeList(String fileName, Map<String, String> map){

        String output = "./" + fileName;
        File file = new File(output);
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {

            for (Map.Entry<String, String> entry : (map).entrySet()) {

                //To place values in lines.txt
                bf.write(entry.getKey() + ":" + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
