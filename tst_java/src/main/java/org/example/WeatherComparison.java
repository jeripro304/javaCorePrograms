package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= "{\"London\":\"Sunny\", \"Paris\":\"Cloudy\", \"Berlin\":\"Rain\"}";
        String s2= "{\"London\":\"Cloudy\", \"Paris\":\"Cloudy\", \"Berlin\":\"Sunny\"}";

//        String s1="{\"Laptop\":\"1200\", \"Headphones\":\"150\", \"Mouse\":\"25\"}";
//        String s2="{\"Laptop\":\"1250\", \"Headphones\":\"150\", \"Mouse\":\"30\"}";

        Pattern p=Pattern.compile("\\w+");
        Matcher m=p.matcher(s1);
        Matcher n=p.matcher(s2);
        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        while (m.find()){
            l1.add(m.group());
        }
        while (n.find()){
            l2.add(n.group());
//            System.out.println(n.group());
        }
        System.out.println(l1);
        System.out.println(l2);
        List<String> ans=new ArrayList<>();
//        System.out.println(s1);
//        System.out.println(s2);
        for (int i=1;i<l1.size();i+=2) {
            String str1 = l1.get(i);
            String str2 = l2.get(i);
            if (!(str1.equals(str2))) {
//                System.out.println(l1.get(i - 1));
                ans.add("\""+l1.get(i-1)+"\"");
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
