package decisionMaking;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args)
	{
		int a=10,b=20,c;
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
		System.out.println("select the case.... : " );
		String var= sc.next();
		
		
		switch(var)
		{
		case "add":
			c=a+b;
			System.out.println("addition result is:" +c);
			break;
			
		case "sub":
			c=a-b;
			System.out.println("subtraction result is:"+c);
			break;
			
			default :
				System.out.println("try again");
	             break;

	}
}
}
}