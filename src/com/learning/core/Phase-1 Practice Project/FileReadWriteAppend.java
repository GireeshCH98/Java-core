package com.learning.core.PracticeProject;

import java.io.*;

public class FileReadWriteAppend {
    public static void main(String[] args) {
		
        String filename = "sample.txt";
        //File filename = new File("sample.txt");
        
        // Write to file
        writeFile(filename, "Java Programming!");

        // Read from file
        String content = readFile(filename);
        System.out.println("File content:");
        System.out.println(content);

        // Append to file
        appendFile(filename, "\nThis is appended content.");
        content = readFile(filename);
        System.out.println("\nFile content after appending:");
        System.out.println(content);
    }

    // Method to write content to a file
    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    public static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return content.toString();
    }

    // Method to append content to a file
    public static void appendFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
            System.out.println("Content appended to file successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
}

