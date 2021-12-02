
public class reverse {

	static String Reverse="";
	public static void reversesrting(String Words)
	{
		//char[] word=Words.toCharArray();
		
		for(int i=0;i<Words.length();i++)

		{
			Reverse=Words.charAt(i)+Reverse;
			//gfsA
			
		}
		System.out.println(Reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
reverse.reversesrting("Ashish");
	}

}
