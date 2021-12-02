import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class charctercount {

	
	public void stringcount(String Name)
	{
		char name[]=Name.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for( Character ch:name)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
				hm.put(ch, 1);
			
		}
		Set<Map.Entry<Character,Integer>> entry=hm.entrySet();
		for(Map.Entry<Character,Integer> E:entry)
		{
			if(E.getValue()>1)
			{
				System.out.println(E.getKey()+":"+E.getValue());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charctercount count=new charctercount();
		count.stringcount("ASHSGJGDHFGDVGVAGHFQTQFTYFDCQDYTFQDC4134");
	}

}
