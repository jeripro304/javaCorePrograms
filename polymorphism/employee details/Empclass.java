//Getting employee details from the user using an array and printing it. 

import java.util.Scanner;

class Empclass{
	String id;
	String name;
	
	Empclass(){}
	
	Empclass(String id,String name){
		this.id =id;
		this.name=name;
	}
	
	public String toString(){
		return id+"\t"+name; 
	}
	
	public void empdetails(Empclass... details){
		for (Empclass d:details){
			System.out.println(d);
		}
	}
	public static void  main(String []a){
		Scanner s= new Scanner(System.in);
		Empclass empdetails[]=new Empclass[5];
		for (int i=0;i<3;i++){
			System.out.print("Enter the student id : ");
			String sid=s.next();
			System.out.print("Enter the student name : ");
			String sname=s.next();
			
			Empclass student =new Empclass(sid,sname);
			
			empdetails[i]=student;//storing the array values in student
		}
		/*Empclass emparr = new Empclass();
		System.out.println("-----------------------------");
		emparr.empdetails(empdetails[0]);
		System.out.println("-----------------------------");
		emparr.empdetails(empdetails[0],empdetails[1]);
		System.out.println("-----------------------------");
		emparr.empdetails(empdetails);
		*/
		Empclass emparr = new Empclass();
		emparr.empdetails(empdetails);
	}
}