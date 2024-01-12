package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        ArrayList<Integer> data=new ArrayList<>();
        //List<Integer> evensum=new ArrayList<>();
        Random rand =new Random();
        for (int i=0;i<50;i++){
            int rand_no = rand.nextInt(50);
            data.add(rand_no);

        }

        for(Integer i:data){
            if (i%2==0){
                System.out.print(i*2+" ");
                sum+=i*2;
            }
        }
        System.out.println("sum is : "+sum);


    }
}