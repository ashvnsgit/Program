import java.util.HashMap;
import java.util.HashSet;

public class duplicatehashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(4);
		hs.add(6);
		hs.add(10);
		hs.add(4);
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "a");
		hm.put(45, "ASGYSD");
		hm.put(1, "ASHIS");
		hm.put(47, "ASGYSD");
		
		
		
		System.out.println(hm);
		
		System.out.println(hs);
		}
	}


