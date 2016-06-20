package declare;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.*;
 public class Test extends Exception{
	 public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		if(t1 instanceof Object)
			System.out.println("t1 is an object");
		if(t1 instanceof Exception)
			System.out.println("t1 is Exception");
	 }
}


		 
