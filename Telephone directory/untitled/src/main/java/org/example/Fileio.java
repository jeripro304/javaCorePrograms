package org.example;


import java.io.*;

import java.util.Scanner;


public class Fileio {
    public static void main(String[] args) {
        byte arr[];
        Scanner sc=new Scanner(System.in);
        File file =new File("test.txt");
        try( FileOutputStream fos =new FileOutputStream(file);
             BufferedOutputStream bos =new BufferedOutputStream(fos);){

            //FileOutputStream fos =new FileOutputStream("Demo.txt");
            System.out.print("Enter the line ");
            String msg=sc.next();
            //String msg="Hi Demo";
            byte sarr[]=msg.getBytes();//conversion of data into the form of bytes
            bos.write(sarr);
            System.out.println("File write success");

        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        //reading th data operation
        try(FileInputStream fis =new FileInputStream("test.txt");
            BufferedInputStream bis =new BufferedInputStream(fis);){
            byte ar =bis.read();
            for (byte daa:ar){
                System.out.println((char)daa);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }


    }
}
