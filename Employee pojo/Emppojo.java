class Emppojo{
	int sid;
	String sname;
	
	
	public void setId(int id){
		sid=id;
	}
	public int getId(){
		return sid;
	}
	public void setName(String name){
		sname=name;
	}
	public String getName(){
		return sname;
	}
	
	public String toString(){
		return sid +"\t"+ sname;
	}
	
}