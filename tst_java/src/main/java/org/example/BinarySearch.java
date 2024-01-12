package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] val={3,6,2,8,35,9,5,33,66,60};
        int search=393;
        int temp;
        for (int i=0;i<val.length;i++){
            for (int j=i+1;j<val.length;j++){
                if (val[i]>val[j]){
                   temp=val[i];
                   val[i]=val[j];
                   val[j]=temp;
                }
            }
        }
        for (int i=0;i<val.length;i++){
            System.out.print(val[i]+" ");
        }
        System.out.println();
        binarysearch(val,search);

    }
    public static String binarysearch(int[] arr,int key){
        int mid =arr.length/2;
//        System.out.println(mid);
       try{
           if (arr[mid]==key){
               System.out.println("element found "+arr[mid]);
           } else if (arr[mid]<key) {
               int [] narr=new int[arr.length-(mid+1)];
//            System.out.println(arr.length);
//            System.out.println(narr.length);
               int j=mid+1;
               for (int i=0;i< narr.length;i++){
                   narr[i]=arr[j];
//                System.out.println(narr[i]);
                   j++;
               }
               binarysearch(narr,key);
           }
           else if (key<arr[mid]){
               int [] narr=new int[arr.length-(mid)];
//            System.out.println(arr.length);
//            System.out.println(narr.length);
               int j=0;
               for (int i=0;i< narr.length;i++){
                   narr[i]=arr[j];
//                System.out.println(narr[i]);
                   j++;
               }
               binarysearch(narr,key);
           }

       }catch (Exception e){
           System.out.println("element not in here");
       }

        return null;
    }
}
