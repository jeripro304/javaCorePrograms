package learning;

import java.util.Scanner;


class jerish{
	int eid;
	String ename;
	String dest;
	long salary;
	
	
	
	void jerry(){
			System.out.println("Employee id : "+eid);
			System.out.println("Employee  name : "+ename);
			System.out.println("Employee no : "+dest);
			System.out.println("Employee salary : "+salary);

	}
	public static void main(String []args){
		jerish emp=new jerish();
		emp.eid=101;
		emp.ename="ABC";
		emp.dest="trainee";
		emp.salary = 28350;
		
		emp.jerry();
		System.out.println(emp);
		
	}
	
}