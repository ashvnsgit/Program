package inheritance;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="I am Sharan 3593";
		System.out.println("The orginal word is ");
		System.out.println(name);
		String original[]=name.split(" ");
		String Original="";
		
		//3593 Sharan am I
		for(int j=0;j<original.length;j++)
		{
			String rev="";
			//rev=Original
			//
			//System.out.println(rev);
		
			
			
		}
		
		for(int i=0;i<name.length();i++)
		{
			Original=name.charAt(i)+Original;
			//Original=Original+name.charAt(i);
		}
		System.out.println("The Reverse of the sentence is ");
		System.out.println(Original);

	}

	

}
