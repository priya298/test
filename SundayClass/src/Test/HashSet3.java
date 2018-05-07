package Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashSet3 
{

	public static void main(String[] args) 
	
	{
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		map.put(1, 100);
		map.put(3, 200);
		map.put(8, 500);
		map.put(15, 60);
		map.put(8, 1);
		System.out.println(map);

	}

}
