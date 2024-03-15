package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class D10P05 
{
    public static void main(String[] args) 
    {
        try {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string: ");
            String input = reader.readLine();

            
            FileWriter writer = new FileWriter("io.txt");
            writer.write(input);
            writer.close();

            
            File file = new File("io.txt");
            long fileSize = file.length();
            System.out.println("Size of the file: " + fileSize + " bytes");

           
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }
            bufferedReader.close();

           
            if (file.delete()) 
            {
                System.out.println("File deleted successfully.");
            } 
            else 
            {
                System.out.println("Failed to delete the file.");
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
