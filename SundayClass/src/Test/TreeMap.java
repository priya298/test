package Test;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "vish");
		map.put(4, "sree");
		map.put(10, "karthi");
		map.put(7, "nani");
		map.put(1, "roni");
		System.out.println(map.get(10));
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		

	}

}
