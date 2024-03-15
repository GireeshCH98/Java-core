package com.learning.core.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class D10P04 
{
    public static void main(String[] args) 
    {
        
    	Path sourcePath = Paths.get("C:\\Users\\suhana r ghasi\\Documents\\GitHub\\Java-core\\src\\com\\learning\\core\\day10\\Source1.txt");
        
        
    	Path destPath = Paths.get("C:\\Users\\suhana r ghasi\\Documents\\GitHub\\Java-core\\src\\com\\learning\\core\\day10\\Destination.txt");

        try 
        {
        	
            Files.copy(sourcePath, destPath);
            System.out.println("File copied successfully.");
        } 
        catch (IOException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}