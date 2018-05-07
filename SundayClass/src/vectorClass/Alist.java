package vectorClass;

//import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Alist {
	

	public static void main(String[] args) 
			{
				Vector<Integer> v = new Vector<>();
				for(int i=1;i<=10;i++)
				{
					v.addElement(i);
				}
				System.out.println(v);
				//Enumeration<Integer> ele = v.elements();
				//while(ele.hasMoreElements())
				Iterator<Integer> ele= v.iterator();
				
				while(ele.hasNext())
				{
					Integer val=ele.next();
					if(val%2==0)
						System.out.println(val);
					else
						ele.remove();
				}
		       System.out.println(v);

	}

}
