import java.util.HashSet;
import java.util.TreeSet;



public class SortinginHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(7);
		hs.add(98);
		hs.add(1);
		hs.add(9);
		System.out.println("The number before sorting is " +hs);
		
		TreeSet<Integer> ts=new TreeSet<Integer>(hs);
		//ts.addAll(hs);
		System.out.println("The number after sorting is " +ts);
		//List<Integer> th=new List<Integer>();
		
		
		
		

	}

}
