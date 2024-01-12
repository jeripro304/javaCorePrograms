package org.example;

public class ExcepHand {
    public static void main(String[] args) throws Exception{
        int n=0;
        int m=0;
        try{
            int x=n/m;
        }
        catch (Exception e){
            throw new INotFoundExcption();
        }

    }
}

