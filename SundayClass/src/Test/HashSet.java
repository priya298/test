package Test;

import java.util.HashMap;
import java.util.Map;

public class HashSet {

	public static void main(String[] args) 
	
	{
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		map.put(1, 100);
		map.put(20, 100);
		map.put(30, 100);
		map.put(4, 100);
		map.put(10, 2000);
		System.out.println(map);
		}

}
