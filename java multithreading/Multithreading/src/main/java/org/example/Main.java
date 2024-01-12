package org.example;

public class Main {
    public static void main(String[] args) {

        Hitcount hc=new Hitcount();
        Demo d=new Demo();
        Test t=new Test();

        Thread t1=new Thread(d);
        Thread t2 =new Thread(d);



//        d.start();
//        t.start();


//        try{
//            d.join();
//            t.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        t.setDaemon(true);
//        d.run();
//        t.run();

//        System.out.println(d.getId()); // to get the id of the thread
//        System.out.println(t.getId());
//        System.out.println(d.getPriority());
//        System.out.println(t.getPriority());


    }
}