package org.example;

import java.util.Scanner;

public class FibWithRecursion {
    public static  long[] fibCache;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n th number to get : ");
        int num=sc.nextInt();

        fibCache =new long[num+1];

        for(int i=0;i<=num;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static long fibonacci(int n){
        if (n<=1) {
            return n;
        }
        if (fibCache[n]!=0){
            return  fibCache[n];
        }
        long fib=  (fibonacci(n-1)+fibonacci(n-2));
        fibCache[n]= fib;
        return  fib;

    }
}
