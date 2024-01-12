package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Pattern {
    public static void main(String[] args) {
//        java.util.regex.Pattern p= java.util.regex.Pattern.compile(".s");
//        Matcher m=p.matcher("as");
//        System.out.println(m.matches());
//        boolean b= java.util.regex.Pattern.compile(".s").matcher("as").matches();
//        System.out.println(b);
//        boolean b2= java.util.regex.Pattern.matches(".*s*","jj");
//        System.out.println(b2);

//        boolean p= java.util.regex.Pattern.matches("[abc]*.*","");
//        System.out.println(p);

//        boolean b3= java.util.regex.Pattern.matches("\\w","ass");
//        System.out.println(b3);

//
//     this is question to check the value for the key is same else print the key if not same
        String json1 = "{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":\"value3\"}";
        String json2 ="{\"key1\":\"val\",\"key2\":\"value2\",\"key3\":\"va\"}";
        System.out.println(json1);
        System.out.println(json2);
        List<String> j1= new ArrayList<>();
        List<String> j2=new ArrayList<>();
        java.util.regex.Pattern p= java.util.regex.Pattern.compile("\\w+");
        Matcher m=p.matcher(json1);
        Matcher n=p.matcher(json2);
        while (m.find()){
//            System.out.println(m.group());
            j1.add(m.group());
        }
        while (n.find()){
//            System.out.println(n.group());
            j2.add(n.group());
        }
//        System.out.println(j1);
//        System.out.println(j2);
        for (int i=1;i<j1.size();i+=2) {
            String str1 = j1.get(i);
            String str2 = j2.get(i);
            if (!(str1.equals(str2))) {
                System.out.println(j1.get(i - 1));
            }
        }
    }
}
