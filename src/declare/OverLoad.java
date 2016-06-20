package declare;

class OverLoad1 {
	void disp(SA a){
		System.out.println("SA class");
	}
	void disp(B b){
		System.out.println("B class");
	}
	//public static void main(String[] args) {
	{
		// TODO Auto-generated method stub
		SA sa = new SA();
		B b = new B();
		b.hello();
		SA sab[]= { new B(), new SA()};
		for(SA a1: sab){
		if(a1 instanceof B){
			B castb = (B)a1;
			castb.hello();
		}
		}

	}
	

}

class SA{
	
}

class B extends SA{
	void hello(){
		System.out.println("hello");
	}
}



