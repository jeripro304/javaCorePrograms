class demo{
	public static void main(String[] a){
		int num1= Integer.parseInt(a[0]);
		int num2 =Integer.parseInt(a[1]);
		String opr =a[2];
		switch(opr){
			case "+": System.out.println("The solution is : "+(num1 +num2));break;
			case "-": System.out.println("The solution is : "+(num1 -num2));break;
			case "*": System.out.println("The solution is : "+(num1 * num2));break;
			case "/": System.out.println("The solution is : "+(num1 / num2));break;
		}
	}
}