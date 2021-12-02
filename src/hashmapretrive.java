import java.util.HashMap;

public class hashmapretrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> ts=new HashMap<Integer,String>();
		ts.put(1, "Ahish");
		ts.put(3, null);
		ts.put(7, "AshishVerma");
		System.out.println(ts);
		ts.put(87, null);
		ts.put(1, null);
		System.out.println(ts);
		
		
		
		
	}

}
