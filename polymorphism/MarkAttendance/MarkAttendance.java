class MarkAttendance{
	void MarkAttendance(){
		System.out.println("Mass bunk");
	}
	void MarkAttendance(String...s){
		System.out.println(s.length+"Students present");
		for(String name:s){
			System.out.println(name);
		}
	}
	public static void main(String []a){
		MarkAttendance m=new MarkAttendance();
		m.MarkAttendance("Jerish","Lokesh","Poornesh","Jeeva");
	}
}