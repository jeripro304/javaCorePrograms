package org.example;

public class Demo extends Hitcount implements Runnable{
    public void run(){
        Hitcount hc=new Hitcount();
        for (int i=0;i<1000;i++){
            hc.getCount();
        }
//        for (int i=0;i<5;i++){
//            System.out.println("java");
//        }
//        try{
//            sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
