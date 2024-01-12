package org.example;

import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee e= new Employee(101,"Jerish",29384);
        System.out.println(e);

        try(FileOutputStream fis =new FileOutputStream("demo.txt");
            ObjectOutputStream ois =new ObjectOutputStream(fis);) {

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}