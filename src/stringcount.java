import java.util.HashMap;
import java.util.Set;

public class stringcount {

	
	public void stringcou(String Name) {
		
		String ABC=Name.trim();
		String[] name=ABC.split(" ");
		if(name.length==1)
		{
			System.out.println("No Duplicate value   "+Name);
		}
		
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String sr:name)
		{
			if(hm.containsKey(sr))
			{
				hm.put(sr, hm.get(sr)+1);
			}
			else
				hm.put(sr, 1);
		}
		
	Set<String> clunt=	hm.keySet();
	for(String cr:clunt )
	{
		if(hm.get(cr)>1)
		{
			System.out.println(cr+":"+hm.get(cr));
		}
	}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringcount COUNT=new stringcount();
		COUNT.stringcou("There is an array of numbers and a number key key");
	}

}
