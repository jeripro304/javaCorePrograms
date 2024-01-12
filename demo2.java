import java.util.Scanner;

class demo2{
	public static void main(String [] srgs){
		int n1,n2,n3,n4,n5;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		if (n1>n2 && n1>n2 && n1>n3 && n1>n4 && n1>n5){
			System.out.println("the  greatest number is "+n1);
		}
		else if (n2>n3 && n2>n4 && n2>n5){
			System.out.println("the  greatest number is "+n2);
		}
		else if(n3>n4 && n3>n5){
			System.out.println("the  greatest number is "+n3);
		}
		else if(n4>n5){
			System.out.println("the  greatest number is "+n4);
		}
		else System.out.println("the  greatest number is "+n5);
	}
}