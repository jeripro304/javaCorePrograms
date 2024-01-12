package org.example;

import java.util.Scanner;

public class Compounding {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long am=sc.nextLong();
        long amount=0;
        for (int i=0;i<38;i++){
            amount= (long) (am+am*0.12);
            am=amount;
        }
        System.out.println(amount);

    }
}
