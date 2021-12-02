package inheritance;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringduplicate("AshishVermamethod");
		stringduplicate("AshishVerma");

	}
	
	public static  void stringduplicate(String Name)
	{
		char name[]=Name.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character ch:name)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
				hm.put(ch, 1);
		}
	Set<Map.Entry<Character,Integer>> entryset=hm.entrySet();
	for(Map.Entry<Character,Integer> entry:entryset)
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
	}
		
		
		
	}

}
