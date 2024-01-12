class parent{
	public static void main(String []args){
		C c=new C();
	}
}
class A{
	{
		
		System.out.println("A");
	}
	
}
class B extends A{
	
	{
		System.out.println("B");
	}
	
}
class C extends B{
	{
		System.out.println("C");
	}
}
