package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


class StoreListTest {

    @Test
    void storeList(HashMap h){
            String nextLine = null;
            HashMap<String, String> list = h;
            list.put("Chocolate", "2021-11-29");
            list.put("Toothpaste", "2021-11-29");
            String output = "./shopping_list.txt";
            File file = new File(output);
            BufferedWriter bf = null;
            try{
                bf = new BufferedWriter(new FileWriter(file));

                for(Map.Entry<String,String> entry : list.entrySet()){

                    //To place values in lines.txt
                    bf.write(entry.getKey() + ":" + entry.getValue());
                    bf.newLine();
                 }
                 bf.flush();
            }
                catch(IOException e){
                    e.printStackTrace();
                }
               finally{
                try{
                  bf.close();
                }
                catch(Exception e){}
               }

            try{
                BufferedReader bR = new BufferedReader(new FileReader("shopping_list.txt"));
                while((nextLine = bR.readLine()) != null){
                    if (nextLine.equals("Chocolate:2021-11-29")){
                        nextLine = "Chocolate";
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        Assertions.assertEquals("Chocolate", nextLine);
    }
}