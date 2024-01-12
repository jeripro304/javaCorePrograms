class Mnclass{
	public static void main(String [] a){
		System.out.println("-------------------------");
		
		
		Director d= new Director(001,"Jerish",20000,"Director",560400400);
		Manager m=new Manager(2,"Jeno",10000,"Devlopment");
		Admin ad=new Admin(3,"Jeagan",1001,"Admin");
		Engineer w=new Engineer(4,"Mohab",5333);
		
		
		printemp(d);
		printemp(m);
		printemp(ad);
		printemp(w);
		
	
		
		/*Director  d;
		d= new Director(80329,"jerish",28350,"ECE",983748957);
		
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getSal());
		System.out.println(d.getDept());
		System.out.println(d.getBud());
		
		
		Employee e;
		
		e = new Manager("Electronics");
		//e.Manger("Electronics");
		
		System.out.println(e.getDept);
		
		e.setId(80329);
		e.setName("Jerish");
		
		System.out.println(e.getId());
		System.out.println(e.getName());*/
	}
	public static void printemp(Employee e){
		if(e instanceof Director){
			Director d= (Director)e;
			
			System.out.println(d.getId());
			System.out.println(d.getName());
			System.out.println(d.getSal());
			System.out.println(d.getDept());
			System.out.println(d.getBud());
			
		}
		else if(e instanceof Manager){
			Manager m=(Manager)e;
			System.out.println(m.getId());
			System.out.println(m.getName());
			System.out.println(m.getSal());
			System.out.println(m.getDept());
		}
		else if(e instanceof Admin){
			Admin  ad= (Admin)e;
			System.out.println(ad.getId());
			System.out.println(ad.getName());
			System.out.println(ad.getSal());
		}
		else if(e instanceof Engineer){
			Engineer  w= (Engineer)e;
			System.out.println(w.getId());
			System.out.println(w.getName());
			System.out.println(w.getSal());
		}
		
	}
}