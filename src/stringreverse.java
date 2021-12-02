


public class stringreverse {
public void stringr(String Name)
{
     // char[] a=Name.toCharArray();	
      String rev="";
      
      for(int i=0;i<Name.length();i++)
      {
    	 rev=Name.charAt(i)+rev;
      }
      System.out.println(rev);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringreverse St=new stringreverse();
		St.stringr("Ashish");

	}

}
