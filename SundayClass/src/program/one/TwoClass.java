package program.one;

import program.two.ThreeClass;

public class TwoClass extends OneClass 
{
 
	public void m2()
	{
		System.out.println("hi iam m2 method in twoclass");
	}
	public static void main(String[] args) {
		
		TwoClass obj=new TwoClass();
		obj.m2();
		obj.m1();
		
		OneClass obj1=new OneClass();
		obj1.m1();
		
		ThreeClass obj2=new ThreeClass();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		

	}

}
