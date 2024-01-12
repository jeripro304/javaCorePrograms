package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        String []sep=s.split(" ");
//        Set<String> set=new HashSet<>();
//        for (String t:sep){
//            set.add(t);
//        }
//        System.out.println(set);
//        Iterator<String> it=set.iterator();
////        while (it.hasNext()){
////            System.out.print(it.next()+" ");
////        }
//        for(String i:set){
//            System.out.println(i);
//        }
        String a="Goodbye bye bye bye world world";
        a=a.replaceAll("bye bye bye","bye");
        System.out.println(a);

    }
}
