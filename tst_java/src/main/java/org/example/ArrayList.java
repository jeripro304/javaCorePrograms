package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        List<String> strArray=new java.util.ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int testCase=sc.nextInt();
        for (int i = 0; i<testCase;i++){
            strArray.add(sc.next());
        }
        Iterator itr=strArray.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
