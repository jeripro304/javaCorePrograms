package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String hexadecimalNumber = generateRandomHexadecimal(15);
        System.out.println("Random 15-digit Hexadecimal Number: " + hexadecimalNumber);
    }

    // Generates a random hexadecimal string of the specified length
    public static String generateRandomHexadecimal(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // Generate a random digit in the range 0-15 (0-F in hexadecimal)
            int digit = random.nextInt(16);
            // Convert the digit to a hexadecimal character
            char hexChar = Character.forDigit(digit, 16);
            sb.append(hexChar);
        }

        return sb.toString();
    }
//    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        c.add(Calendar.DAY_OF_MONTH,30);
//        Date sqldate=new Date(c.getTimeInMillis());
//        System.out.println(sqldate);
//        java.sql.Date sqlDate = new java.sql.Date(sqldate.getTime());
//        System.out.println(sqlDate);
//
//    }
}