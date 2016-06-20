package test;

enum Project{
	NAME;
}
public class AccessModifiers {
	public int x = 9;
	public Coffee p;
	Project de;
	long []t[];
	public enum x{
		a;
	}
	public x xe;
	public final void accessTest( int x){
		this.x = x;
		System.out.println("access test"+x);
		 
		
	}
}

abstract class A extends AccessModifiers{
	
	
	final int r = 6;
	void hello(){
		System.out.println(x);
	}
	abstract  void cut();
    	
}

class B extends A{
	
	void cut(){}
	
}
