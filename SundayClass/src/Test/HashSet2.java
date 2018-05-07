package Test;

import java.util.HashMap;
import java.util.Map;

public class HashSet2 {

	public static void main(String[] args) 
	{
		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("vishnu", 4);
		map.put("madhu",9);
		map.put("jaya", 10);
		map.put("karthi", 100);
		System.out.println(map.get("vishnu"));
		System.out.println(map.get("karthi"));
}
	       
	     

}
