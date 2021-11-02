package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EditListTest {

    @Test
    void storeList(){
        /*
            Create HashMap initialized with keys and values
            String output = lines.txt located in local storage
            File file = new File(output)
            BufferedWriter bf = null;
            try{
                bf = new BufferedWriter(newFileWriter(file))

                for loop printing out entry in HashMap{
                    bf.write(entry.getKey() + ":" + entry.getValue()) to place values in lines.txt
                    bf.newline
                 }
                 bf.flush()
            }
                catch w/ IOException
               finally{
                try{
                  bf.close()
                }
                catch w/ Exception
               }
         */

    }

    @Test
    void removeList(HashMap<String,String> listTitle){
        /*
        String filePath = "list.txt";
        HashMap<String, String> map = new HashMap<String, String>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        if((line= reader.readLine()).equals(listTitle){
        while ((line = reader.readLine()) != null)
         {
            line = line.replaceAll(reader.readLine()), "")
          }
        }

        reader.close
       */

    }

    @Test
    void editListTitle(Map<String,String> listTitle){
        /*
            Map<String, String> newTitle = new HashMap<>();

            newTitle .putAll(listTitle)

         */


    }
}