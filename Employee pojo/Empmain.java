//Code for getting inputs of the employee name and id and printing it uding pojo 

import java.util.Scanner;

class Empmain{

	void attend(Emppojo...arr){
		for(Emppojo d:arr){
			System.out.println(d);
		}
	}
	
	
	public static void main(String []a){
		Scanner s = new Scanner(System.in);
		Emppojo arr[]= new Emppojo[5];
		for (int i=0;i<3;i++){
			Emppojo po=new Emppojo();
			System.out.print("Enter the id : ");
			po.setId(s.nextInt());
			System.out.print("Enter the name : ");
			po.setName(s.next());
			
			arr[i]=po;
		}
		Empmain obj =new Empmain();
		obj.attend(arr);
		
		
	}
}