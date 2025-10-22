package com.example.labprog.onepage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    public static ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        
        try{
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while((line = bufferedReader.readLine()) != null); {
                lines.add(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }


}
