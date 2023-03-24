package icici.loans.collection;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(10000,100);
		h.put(20,200);
		h.put(3,300);
		h.put(1,400);
		h.put(40,200);
		h.put(500,500);
		h.put(10,600);
		
		System.out.println(h);
		System.out.println(h.get(30));
		System.out.println(h.get(10));
		
		Set<Integer> keys = h.keySet();
		for(Integer k:keys)
		{
			System.out.println(k+"--->"+h.get(k));
		}
	}

}
