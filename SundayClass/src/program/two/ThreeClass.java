package program.two;

import program.one.TwoClass;

public class ThreeClass extends TwoClass
{

	public void m3()
	{
		System.out.println("hi iam m3 method in three class");
	}
	public static void main(String[] args) {
		
		ThreeClass obj=new ThreeClass();
				obj.m3();
				obj.m1();
				obj.m2();
				

	}

}
